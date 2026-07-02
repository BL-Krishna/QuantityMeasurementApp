package com.quantitymeasurement.quantitymeasurement.dto;

import com.quantitymeasurement.quantitymeasurement.enums.QuantityCategory;

public record QuantityResponse(

        Long id,

        Double value,

        String unit,

        QuantityCategory category

) {
}