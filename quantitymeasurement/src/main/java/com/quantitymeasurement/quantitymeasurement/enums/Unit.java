package com.quantitymeasurement.quantitymeasurement.enums;

public interface Unit {

    double convertToBaseUnit(double value);

    double convertFromBaseUnit(double baseValue);
}