package com.example.service.controller;

import com.example.service.controller.model.HelloBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api", produces = "application/json")
public class HelloController {

    @PostMapping("/hello")
    @ApiResponse(responseCode = "200", description = "The server accepted your hello.")
    String hello(@Validated @RequestBody final HelloBody helloBody) {
        return "World!";
    }
}
