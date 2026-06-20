package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    public static boolean checkEquality(
            double value1,
            LengthUnit unit1,
            double value2,
            LengthUnit unit2) {

        QuantityLength first =
                new QuantityLength(value1, unit1);

        QuantityLength second =
                new QuantityLength(value2, unit2);

        return first.equals(second);
    }

    public static void main(String[] args) {

        System.out.println(
                checkEquality(
                        1,
                        LengthUnit.FEET,
                        12,
                        LengthUnit.INCH));

        System.out.println(
                checkEquality(
                        1,
                        LengthUnit.INCH,
                        1,
                        LengthUnit.INCH));
    }
}