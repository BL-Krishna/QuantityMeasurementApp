package com.quantitymeasurement.quantitymeasurement.enums;

public enum LengthUnit implements Unit {

    FEET(1.0),

    INCH(1.0 / 12),

    YARD(3.0),

    CENTIMETER(1.0 / 30.48);

    private final double factor;

    LengthUnit(double factor) {
        this.factor = factor;
    }

    @Override
    public double convertToBaseUnit(double value) {
        return value * factor;
    }

    @Override
    public double convertFromBaseUnit(double value) {
        return value / factor;
    }
}