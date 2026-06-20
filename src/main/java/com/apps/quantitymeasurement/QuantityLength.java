package com.apps.quantitymeasurement;

import java.util.Objects;

/**
 * Represents an immutable length measurement.
 */
public class QuantityLength {

    private static final double EPSILON = 0.0001;

    private final double value;
    private final LengthUnit unit;

    public QuantityLength(double value,
                          LengthUnit unit) {

        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException(
                    "Value must be finite");
        }

        if (unit == null) {
            throw new IllegalArgumentException(
                    "Unit cannot be null");
        }

        this.value = value;
        this.unit = unit;
    }

    private double convertToBaseUnit() {
        return value * unit.getConversionFactor();
    }

    /**
     * Convert current quantity to target unit.
     */
    public QuantityLength convertTo(
            LengthUnit targetUnit) {

        if (targetUnit == null) {
            throw new IllegalArgumentException(
                    "Target unit cannot be null");
        }

        double baseValue = convertToBaseUnit();

        double convertedValue =
                baseValue /
                        targetUnit.getConversionFactor();

        return new QuantityLength(
                convertedValue,
                targetUnit);
    }

    /**
     * Static conversion API
     */
    public static double convert(
            double value,
            LengthUnit source,
            LengthUnit target) {

        QuantityLength quantity =
                new QuantityLength(value, source);

        return quantity
                .convertTo(target)
                .getValue();
    }

    public double getValue() {
        return value;
    }

    public LengthUnit getUnit() {
        return unit;
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

        return Math.abs(
                convertToBaseUnit() -
                        other.convertToBaseUnit())
                < EPSILON;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                Math.round(
                        convertToBaseUnit() * 10000));
    }

    @Override
    public String toString() {

        return String.format(
                "Quantity(%.4f, %s)",
                value,
                unit);
    }

    public QuantityLength add(
            QuantityLength other) {

        if (other == null) {
            throw new IllegalArgumentException(
                    "Other quantity cannot be null");
        }

        double thisInBase =
                convertToBaseUnit();

        double otherInBase =
                other.convertToBaseUnit();

        double totalBase =
                thisInBase + otherInBase;

        double resultValue =
                totalBase /
                        unit.getConversionFactor();

        return new QuantityLength(
                resultValue,
                unit);
    }
    public static QuantityLength add(
            QuantityLength first,
            QuantityLength second) {

        if (first == null ||
                second == null) {

            throw new IllegalArgumentException(
                    "Operands cannot be null");
        }

        return first.add(second);
    }

    public static QuantityLength add(
            double value1,
            LengthUnit unit1,
            double value2,
            LengthUnit unit2) {

        QuantityLength first =
                new QuantityLength(
                        value1,
                        unit1);

        QuantityLength second =
                new QuantityLength(
                        value2,
                        unit2);

        return first.add(second);
    }
    private QuantityLength addInternal(
            QuantityLength other,
            LengthUnit targetUnit) {

        if (other == null) {
            throw new IllegalArgumentException(
                    "Other quantity cannot be null");
        }

        if (targetUnit == null) {
            throw new IllegalArgumentException(
                    "Target unit cannot be null");
        }

        double totalBaseValue =
                this.convertToBaseUnit()
                        + other.convertToBaseUnit();

        double convertedValue =
                totalBaseValue /
                        targetUnit.getConversionFactor();

        return new QuantityLength(
                convertedValue,
                targetUnit);
    }
    public QuantityLength add(
            QuantityLength other,
            LengthUnit targetUnit) {

        return addInternal(
                other,
                targetUnit);
    }

    public static QuantityLength add(
            QuantityLength first,
            QuantityLength second,
            LengthUnit targetUnit) {

        if (first == null ||
                second == null) {

            throw new IllegalArgumentException(
                    "Operands cannot be null");
        }

        return first.add(
                second,
                targetUnit);
    }
    public static QuantityLength add(
            double value1,
            LengthUnit unit1,

            double value2,
            LengthUnit unit2,

            LengthUnit targetUnit) {

        QuantityLength first =
                new QuantityLength(
                        value1,
                        unit1);

        QuantityLength second =
                new QuantityLength(
                        value2,
                        unit2);

        return add(
                first,
                second,
                targetUnit);
    }


}