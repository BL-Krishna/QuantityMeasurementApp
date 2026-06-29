package com.apps.quantitymeasurement;

import java.util.Objects;

public class QuantityWeight {

    private static final double EPSILON = 0.0001;

    private final double value;
    private final WeightUnit unit;

    public QuantityWeight(double value,
                          WeightUnit unit) {

        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException(
                    "Invalid value");
        }

        if (unit == null) {
            throw new IllegalArgumentException(
                    "Unit cannot be null");
        }

        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public WeightUnit getUnit() {
        return unit;
    }

    public QuantityWeight convertTo(
            WeightUnit targetUnit) {

        if (targetUnit == null) {
            throw new IllegalArgumentException(
                    "Target unit cannot be null");
        }

        double base =
                unit.convertToBaseUnit(value);

        double converted =
                targetUnit.convertFromBaseUnit(base);

        return new QuantityWeight(
                converted,
                targetUnit);
    }

    public static double convert(
            double value,
            WeightUnit source,
            WeightUnit target) {

        return new QuantityWeight(value, source)
                .convertTo(target)
                .getValue();
    }

    public QuantityWeight add(
            QuantityWeight other) {

        return add(other, this.unit);
    }

    public QuantityWeight add(
            QuantityWeight other,
            WeightUnit targetUnit) {

        if (other == null) {
            throw new IllegalArgumentException(
                    "Other quantity cannot be null");
        }

        if (targetUnit == null) {
            throw new IllegalArgumentException(
                    "Target unit cannot be null");
        }

        double totalBase =

                unit.convertToBaseUnit(value)

                        +

                        other.unit.convertToBaseUnit(
                                other.value);

        double converted =

                targetUnit.convertFromBaseUnit(
                        totalBase);

        return new QuantityWeight(
                converted,
                targetUnit);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null ||
                getClass() != obj.getClass())
            return false;

        QuantityWeight other =
                (QuantityWeight) obj;

        return Math.abs(

                unit.convertToBaseUnit(value)

                        -

                        other.unit.convertToBaseUnit(
                                other.value)

        ) < EPSILON;
    }

    @Override
    public int hashCode() {

        return Objects.hash(

                Math.round(

                        unit.convertToBaseUnit(value)
                                * 10000));
    }

    @Override
    public String toString() {

        return String.format(
                "Quantity(%.2f, %s)",
                value,
                unit);
    }
}