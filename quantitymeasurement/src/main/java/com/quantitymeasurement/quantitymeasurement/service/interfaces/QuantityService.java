package com.quantitymeasurement.quantitymeasurement.service.interfaces;

import com.quantitymeasurement.quantitymeasurement.dto.QuantityRequest;
import com.quantitymeasurement.quantitymeasurement.dto.QuantityResponse;
import com.quantitymeasurement.quantitymeasurement.dto.ArithmeticRequest;
import com.quantitymeasurement.quantitymeasurement.dto.CompareRequest;
import com.quantitymeasurement.quantitymeasurement.dto.ConvertRequest;
import java.util.List;

public interface QuantityService {
    double convert(ConvertRequest request);

    boolean compare(CompareRequest request);

    double add(ArithmeticRequest request);

    double subtract(ArithmeticRequest request);

    double multiply(double first,
                    double second);

    double divide(double first,
                  double second);

    QuantityResponse createQuantity(
            QuantityRequest request);

    List<QuantityResponse> getAllQuantities();

    QuantityResponse getQuantityById(
            Long id);

    QuantityResponse updateQuantity(
            Long id,
            QuantityRequest request);

    void deleteQuantity(
            Long id);


}