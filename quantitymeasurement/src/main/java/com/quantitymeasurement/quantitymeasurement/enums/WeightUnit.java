package com.quantitymeasurement.quantitymeasurement.enums;

public enum WeightUnit implements Unit {

    KILOGRAM(1),

    GRAM(0.001),

    TONNE(1000);

    private final double factor;

    WeightUnit(double factor) {
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