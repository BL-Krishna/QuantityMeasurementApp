package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    void testEquality_FeetToFeet_SameValue() {

        QuantityLength first =
                new QuantityLength(
                        1.0,
                        LengthUnit.FEET);

        QuantityLength second =
                new QuantityLength(
                        1.0,
                        LengthUnit.FEET);

        assertEquals(first, second);
    }

    @Test
    void testEquality_InchToInch_SameValue() {

        QuantityLength first =
                new QuantityLength(
                        1.0,
                        LengthUnit.INCH);

        QuantityLength second =
                new QuantityLength(
                        1.0,
                        LengthUnit.INCH);

        assertEquals(first, second);
    }

    @Test
    void testEquality_FeetToInch_EquivalentValue() {

        QuantityLength feet =
                new QuantityLength(
                        1.0,
                        LengthUnit.FEET);

        QuantityLength inch =
                new QuantityLength(
                        12.0,
                        LengthUnit.INCH);

        assertEquals(feet, inch);
    }

    @Test
    void testEquality_InchToFeet_EquivalentValue() {

        QuantityLength inch =
                new QuantityLength(
                        12.0,
                        LengthUnit.INCH);

        QuantityLength feet =
                new QuantityLength(
                        1.0,
                        LengthUnit.FEET);

        assertEquals(inch, feet);
    }

    @Test
    void testEquality_FeetToFeet_DifferentValue() {

        QuantityLength first =
                new QuantityLength(
                        1.0,
                        LengthUnit.FEET);

        QuantityLength second =
                new QuantityLength(
                        2.0,
                        LengthUnit.FEET);

        assertNotEquals(first, second);
    }

    @Test
    void testEquality_InchToInch_DifferentValue() {

        QuantityLength first =
                new QuantityLength(
                        1.0,
                        LengthUnit.INCH);

        QuantityLength second =
                new QuantityLength(
                        2.0,
                        LengthUnit.INCH);

        assertNotEquals(first, second);
    }

    @Test
    void testEquality_SameReference() {

        QuantityLength quantity =
                new QuantityLength(
                        1.0,
                        LengthUnit.FEET);

        assertEquals(quantity, quantity);
    }

    @Test
    void testEquality_NullComparison() {

        QuantityLength quantity =
                new QuantityLength(
                        1.0,
                        LengthUnit.FEET);

        assertNotEquals(null, quantity);
    }

    @Test
    void testEquality_InvalidUnit() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new QuantityLength(
                        1.0,
                        null));
    }
}