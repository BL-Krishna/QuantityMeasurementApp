package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.apps.quantitymeasurement.QuantityMeasurementApp.Feet;
import com.apps.quantitymeasurement.QuantityMeasurementApp.Inches;

public class QuantityMeasurementAppTest {

    // FEET TESTS

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

        Feet feet1 = new Feet(1.0);
        Feet feet2 = new Feet(1.0);

        assertEquals(feet1, feet2);
    }

    @Test
    void testEquality_InchToFeet_EquivalentValue() {

        QuantityLength inch =
                new QuantityLength(
                        12.0,
                        LengthUnit.INCH);

        Feet feet1 = new Feet(1.0);
        Feet feet2 = new Feet(2.0);

        assertNotEquals(feet1, feet2);
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

    // INCH TESTS

    @Test
    void testInchesEquality_SameValue() {

        Inches inch1 = new Inches(1.0);
        Inches inch2 = new Inches(1.0);

        assertEquals(inch1, inch2);
    }

    @Test
    void testInchesEquality_DifferentValue() {

        Inches inch1 = new Inches(1.0);
        Inches inch2 = new Inches(2.0);

        assertNotEquals(inch1, inch2);
    }

    @Test
    void testInchesEquality_NullComparison() {

        Inches inch = new Inches(1.0);

        assertNotEquals(null, inch);
    }

    @Test
    void testInchesEquality_DifferentClass() {

        Inches inch = new Inches(1.0);

        assertNotEquals(inch, "1.0");
    }

    @Test
    void testInchesEquality_SameReference() {

        Inches inch = new Inches(1.0);

        assertEquals(inch, inch);
    }

    // STATIC METHOD TESTS

    @Test
    void testCheckFeetEquality() {

        assertTrue(
                QuantityMeasurementApp
                        .checkFeetEquality(1.0, 1.0));
    }

    @Test
    void testCheckInchesEquality() {

        assertTrue(
                QuantityMeasurementApp
                        .checkInchesEquality(1.0, 1.0));
    }
}