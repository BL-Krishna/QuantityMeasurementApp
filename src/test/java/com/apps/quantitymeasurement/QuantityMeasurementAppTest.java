package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.apps.quantitymeasurement.QuantityMeasurementApp.Feet;

public class QuantityMeasurementAppTest {

    @Test
    void testFeetEquality_SameValue() {

        Feet firstFeet = new Feet(1.0);
        Feet secondFeet = new Feet(1.0);

        assertEquals(firstFeet, secondFeet);
    }

    @Test
    void testFeetEquality_DifferentValue() {

        Feet firstFeet = new Feet(1.0);
        Feet secondFeet = new Feet(2.0);

        assertNotEquals(firstFeet, secondFeet);
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
}