package com.quantitymeasurement.quantitymeasurement.mapper;

import com.quantitymeasurement.quantitymeasurement.dto.QuantityRequest;
import com.quantitymeasurement.quantitymeasurement.dto.QuantityResponse;
import com.quantitymeasurement.quantitymeasurement.entity.Quantity;

public class QuantityMapper {

    private QuantityMapper() {
    }

    public static Quantity toEntity(
            QuantityRequest request) {

        return Quantity.builder()
                .value(request.value())
                .unit(request.unit())
                .category(request.category())
                .build();
    }

    public static QuantityResponse toResponse(
            Quantity quantity) {

        return new QuantityResponse(

                quantity.getId(),

                quantity.getValue(),

                quantity.getUnit(),

                quantity.getCategory()

        );
    }

}