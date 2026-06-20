package com.apps.quantitymeasurement;

import java.util.Objects;

public class QuantityLength {

    private final double value;
    private final LengthUnit unit;

    public QuantityLength(double value,
                          LengthUnit unit) {

        if (unit == null) {
            throw new IllegalArgumentException(
                    "Unit cannot be null");
        }

        this.value = value;
        this.unit = unit;
    }

    private double convertToFeet() {
        return value * unit.getConversionFactor();
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null ||
                getClass() != obj.getClass())
            return false;

        QuantityLength other =
                (QuantityLength) obj;

        return Double.compare(
                convertToFeet(),
                other.convertToFeet()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(convertToFeet());
    }
}