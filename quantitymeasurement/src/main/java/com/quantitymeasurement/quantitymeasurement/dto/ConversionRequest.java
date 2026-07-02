package com.quantitymeasurement.quantitymeasurement.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ConversionRequest(

        @NotNull
        Double value,

        @NotBlank
        String sourceUnit,

        @NotBlank
        String targetUnit

) {
}