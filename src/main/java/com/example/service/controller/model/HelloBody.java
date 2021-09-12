package com.example.service.controller.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class HelloBody {
    @NotNull
    private String helloValue;
}
