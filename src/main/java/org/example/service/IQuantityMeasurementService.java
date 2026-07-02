package org.example.service;

import org.example.dto.QuantityDTO;
import org.example.entity.QuantityMeasurementEntity;

public interface IQuantityMeasurementService {

    QuantityMeasurementEntity compare(
            QuantityDTO q1,
            QuantityDTO q2
    );

    QuantityMeasurementEntity convert(
            QuantityDTO q,
            String targetUnit
    );

    QuantityMeasurementEntity add(
            QuantityDTO q1,
            QuantityDTO q2
    );
}