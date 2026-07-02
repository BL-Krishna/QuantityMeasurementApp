package com.quantitymeasurement.quantitymeasurement.repository;

import com.quantitymeasurement.quantitymeasurement.entity.Quantity;
import com.quantitymeasurement.quantitymeasurement.enums.QuantityCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuantityRepository
        extends JpaRepository<Quantity, Long> {

    List<Quantity> findByCategory(
            QuantityCategory category);

    List<Quantity> findByUnit(
            String unit);

    List<Quantity> findByCategoryAndUnit(
            QuantityCategory category,
            String unit);
}