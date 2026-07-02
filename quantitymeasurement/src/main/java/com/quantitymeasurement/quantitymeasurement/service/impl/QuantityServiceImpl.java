package com.quantitymeasurement.quantitymeasurement.service.impl;

import com.quantitymeasurement.quantitymeasurement.dto.QuantityRequest;
import com.quantitymeasurement.quantitymeasurement.dto.QuantityResponse;
import com.quantitymeasurement.quantitymeasurement.entity.Quantity;
import com.quantitymeasurement.quantitymeasurement.exception.ResourceNotFoundException;
import com.quantitymeasurement.quantitymeasurement.mapper.QuantityMapper;
import com.quantitymeasurement.quantitymeasurement.repository.QuantityRepository;
import com.quantitymeasurement.quantitymeasurement.service.interfaces.QuantityService;
import com.quantitymeasurement.quantitymeasurement.dto.ArithmeticRequest;
import com.quantitymeasurement.quantitymeasurement.dto.CompareRequest;
import com.quantitymeasurement.quantitymeasurement.dto.ConvertRequest;
import com.quantitymeasurement.quantitymeasurement.util.QuantityCalculator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuantityServiceImpl
        implements QuantityService {

    private final QuantityRepository repository;

    public QuantityServiceImpl(
            QuantityRepository repository) {

        this.repository = repository;
    }

    @Override
    public QuantityResponse createQuantity(
            QuantityRequest request) {

        Quantity quantity =
                QuantityMapper.toEntity(request);

        return QuantityMapper.toResponse(
                repository.save(quantity));
    }

    @Override
    public List<QuantityResponse> getAllQuantities() {

        return repository.findAll()

                .stream()

                .map(QuantityMapper::toResponse)

                .toList();
    }

    @Override
    public QuantityResponse getQuantityById(
            Long id) {

        Quantity quantity =
                repository.findById(id)

                        .orElseThrow(() ->

                                new ResourceNotFoundException(
                                        "Quantity not found with id : " + id));

        return QuantityMapper.toResponse(quantity);
    }

    @Override
    public QuantityResponse updateQuantity(
            Long id,
            QuantityRequest request) {

        Quantity quantity =
                repository.findById(id)

                        .orElseThrow(() ->

                                new ResourceNotFoundException(
                                        "Quantity not found with id : " + id));

        quantity.setValue(request.value());
        quantity.setUnit(request.unit());
        quantity.setCategory(request.category());

        return QuantityMapper.toResponse(
                repository.save(quantity));
    }

    @Override
    public void deleteQuantity(
            Long id) {

        if (!repository.existsById(id)) {

            throw new ResourceNotFoundException(
                    "Quantity not found with id : " + id);
        }

        repository.deleteById(id);
    }

    @Override
    public double convert(ConvertRequest request) {

        return QuantityCalculator.convert(

                request.value(),

                request.fromUnit(),

                request.toUnit()

        );
    }

    @Override
    public boolean compare(CompareRequest request) {

        return QuantityCalculator.compare(

                request.firstValue(),

                request.firstUnit(),

                request.secondValue(),

                request.secondUnit()

        );
    }

    @Override
    public double add(ArithmeticRequest request) {

        return QuantityCalculator.add(

                request.firstValue(),

                request.firstUnit(),

                request.secondValue(),

                request.secondUnit()

        );
    }

    @Override
    public double subtract(ArithmeticRequest request) {

        return QuantityCalculator.subtract(

                request.firstValue(),

                request.firstUnit(),

                request.secondValue(),

                request.secondUnit()

        );
    }

    @Override
    public double multiply(double first,
                           double second) {

        return QuantityCalculator.multiply(
                first,
                second);
    }

    @Override
    public double divide(double first,
                         double second) {

        return QuantityCalculator.divide(
                first,
                second);
    }

}