package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.apps.quantitymeasurement.QuantityMeasurementApp.Feet;
import com.apps.quantitymeasurement.QuantityMeasurementApp.Inches;

public class QuantityMeasurementAppTest {

    // FEET TESTS

    @Test
    void testFeetEquality_SameValue() {

        Feet feet1 = new Feet(1.0);
        Feet feet2 = new Feet(1.0);

        assertEquals(feet1, feet2);
    }

    @Test
    void testFeetEquality_DifferentValue() {

        Feet feet1 = new Feet(1.0);
        Feet feet2 = new Feet(2.0);

        assertNotEquals(feet1, feet2);
    }

    @Test
    void testFeetEquality_NullComparison() {

        Feet feet = new Feet(1.0);

        assertNotEquals(null, feet);
    }

    @Test
    void testFeetEquality_DifferentClass() {

        Feet feet = new Feet(1.0);

        assertNotEquals(feet, "1.0");
    }

    @Test
    void testFeetEquality_SameReference() {

        Feet feet = new Feet(1.0);

        assertEquals(feet, feet);
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