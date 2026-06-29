package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {
    public static void main(String[] args) {

        QuantityWeight kg =
                new QuantityWeight(
                        1,
                        WeightUnit.KILOGRAM);

        QuantityWeight gram =
                new QuantityWeight(
                        1000,
                        WeightUnit.GRAM);

        QuantityWeight pound =
                new QuantityWeight(
                        2.20462,
                        WeightUnit.POUND);

        System.out.println(kg.equals(gram));

        System.out.println(
                pound.convertTo(
                        WeightUnit.KILOGRAM));

        System.out.println(
                kg.add(gram));

        System.out.println(
                kg.add(
                        gram,
                        WeightUnit.GRAM));
    }

}