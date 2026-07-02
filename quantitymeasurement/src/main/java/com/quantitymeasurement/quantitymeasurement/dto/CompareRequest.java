package com.quantitymeasurement.quantitymeasurement.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CompareRequest(

        @NotNull
        Double firstValue,

        @NotBlank
        String firstUnit,

        @NotNull
        Double secondValue,

        @NotBlank
        String secondUnit
) {
}