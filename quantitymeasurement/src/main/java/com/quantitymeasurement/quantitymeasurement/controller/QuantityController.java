package com.quantitymeasurement.quantitymeasurement.controller;

import com.quantitymeasurement.quantitymeasurement.dto.QuantityRequest;
import com.quantitymeasurement.quantitymeasurement.dto.QuantityResponse;
import com.quantitymeasurement.quantitymeasurement.service.interfaces.QuantityService;
import com.quantitymeasurement.quantitymeasurement.dto.ArithmeticRequest;
import com.quantitymeasurement.quantitymeasurement.dto.CompareRequest;
import com.quantitymeasurement.quantitymeasurement.dto.ConvertRequest;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/quantities")
public class QuantityController {

    private final QuantityService quantityService;

    public QuantityController(QuantityService quantityService) {
        this.quantityService = quantityService;
    }

    @PostMapping
    public ResponseEntity<QuantityResponse> createQuantity(
            @Valid @RequestBody QuantityRequest request) {

        QuantityResponse response =
                quantityService.createQuantity(request);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }

    @GetMapping
    public ResponseEntity<List<QuantityResponse>> getAllQuantities() {

        return ResponseEntity.ok(
                quantityService.getAllQuantities());
    }

    @GetMapping("/{id}")
    public ResponseEntity<QuantityResponse> getQuantityById(
            @PathVariable Long id) {

        return ResponseEntity.ok(
                quantityService.getQuantityById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<QuantityResponse> updateQuantity(
            @PathVariable Long id,
            @Valid @RequestBody QuantityRequest request) {

        return ResponseEntity.ok(
                quantityService.updateQuantity(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQuantity(
            @PathVariable Long id) {

        quantityService.deleteQuantity(id);

        return ResponseEntity.noContent().build();
    }

    @PostMapping("/convert")
    public ResponseEntity<Double> convert(

            @RequestBody
            @Valid
            ConvertRequest request) {

        return ResponseEntity.ok(

                quantityService.convert(request)

        );
    }
    @PostMapping("/compare")
    public ResponseEntity<Boolean> compare(

            @RequestBody
            @Valid
            CompareRequest request) {

        return ResponseEntity.ok(

                quantityService.compare(request)

        );
    }
    @PostMapping("/add")
    public ResponseEntity<Double> add(

            @RequestBody
            @Valid
            ArithmeticRequest request) {

        return ResponseEntity.ok(

                quantityService.add(request)

        );
    }
    @PostMapping("/subtract")
    public ResponseEntity<Double> subtract(

            @RequestBody
            @Valid
            ArithmeticRequest request) {

        return ResponseEntity.ok(

                quantityService.subtract(request)

        );
    }
    @PostMapping("/multiply")
    public ResponseEntity<Double> multiply(

            @RequestParam
            double first,

            @RequestParam
            double second) {

        return ResponseEntity.ok(

                quantityService.multiply(

                        first,

                        second

                )
        );
    }
    @PostMapping("/divide")
    public ResponseEntity<Double> divide(

            @RequestParam
            double first,

            @RequestParam
            double second) {

        return ResponseEntity.ok(

                quantityService.divide(

                        first,

                        second

                )
        );
    }




}