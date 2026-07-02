package com.quantitymeasurement.quantitymeasurement.util;

import com.quantitymeasurement.quantitymeasurement.enums.LengthUnit;

public class QuantityCalculator {

    private QuantityCalculator() {
    }

    private static LengthUnit getLengthUnit(String unit) {
        return LengthUnit.valueOf(unit.toUpperCase());
    }

    public static double convert(double value,
                                 String from,
                                 String to) {

        LengthUnit fromUnit = getLengthUnit(from);
        LengthUnit toUnit = getLengthUnit(to);

        double baseValue = fromUnit.convertToBaseUnit(value);

        return toUnit.convertFromBaseUnit(baseValue);
    }

    public static boolean compare(double value1,
                                  String unit1,
                                  double value2,
                                  String unit2) {

        double converted = convert(value2, unit2, unit1);

        return Math.abs(value1 - converted) < 0.0001;
    }

    public static double add(double value1,
                             String unit1,
                             double value2,
                             String unit2) {

        return value1 + convert(value2, unit2, unit1);
    }

    public static double subtract(double value1,
                                  String unit1,
                                  double value2,
                                  String unit2) {

        return value1 - convert(value2, unit2, unit1);
    }

    public static double multiply(double value1,
                                  double value2) {

        return value1 * value2;
    }

    public static double divide(double value1,
                                double value2) {

        if (value2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        return value1 / value2;
    }
}