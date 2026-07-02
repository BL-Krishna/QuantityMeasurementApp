package com.quantitymeasurement.quantitymeasurement.dto;

import com.quantitymeasurement.quantitymeasurement.enums.QuantityCategory;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record QuantityRequest(

        @NotNull
        Double value,

        @NotBlank
        String unit,

        @NotNull
        QuantityCategory category

) {
}