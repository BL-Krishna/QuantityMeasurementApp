package com.quantitymeasurement.quantitymeasurement.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ConvertRequest(

        @NotNull
        Double value,

        @NotBlank
        String fromUnit,

        @NotBlank
        String toUnit
) {
}