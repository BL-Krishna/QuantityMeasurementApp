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

//    @Test
//    void testCheckFeetEquality() {
//
//        assertTrue(
//                QuantityMeasurementApp
//                        .checkFeetEquality(1.0, 1.0));
//    }
//
//    @Test
//    void testCheckInchesEquality() {
//
//        assertTrue(
//                QuantityMeasurementApp
//                        .checkInchesEquality(1.0, 1.0));
//    }

    @Test
    void testEquality_YardToYard_SameValue() {

        QuantityLength yard1 =
                new QuantityLength(
                        1,
                        LengthUnit.YARD);

        QuantityLength yard2 =
                new QuantityLength(
                        1,
                        LengthUnit.YARD);

        assertEquals(yard1, yard2);
    }
    @Test
    void testEquality_YardToYard_DifferentValue() {

        QuantityLength yard1 =
                new QuantityLength(
                        1,
                        LengthUnit.YARD);

        QuantityLength yard2 =
                new QuantityLength(
                        2,
                        LengthUnit.YARD);

        assertNotEquals(yard1, yard2);
    }
    @Test
    void testEquality_YardToFeet_EquivalentValue() {

        QuantityLength yard =
                new QuantityLength(
                        1,
                        LengthUnit.YARD);

        QuantityLength feet =
                new QuantityLength(
                        3,
                        LengthUnit.FEET);

        assertEquals(yard, feet);
    }
    @Test
    void testEquality_FeetToYard_EquivalentValue() {

        QuantityLength feet =
                new QuantityLength(
                        3,
                        LengthUnit.FEET);

        QuantityLength yard =
                new QuantityLength(
                        1,
                        LengthUnit.YARD);

        assertEquals(feet, yard);
    }
    @Test
    void testEquality_YardToInch_EquivalentValue() {

        QuantityLength yard =
                new QuantityLength(
                        1,
                        LengthUnit.YARD);

        QuantityLength inch =
                new QuantityLength(
                        36,
                        LengthUnit.INCH);

        assertEquals(yard, inch);
    }
    @Test
    void testEquality_CentimeterToCentimeter() {

        QuantityLength cm1 =
                new QuantityLength(
                        2,
                        LengthUnit.CENTIMETER);

        QuantityLength cm2 =
                new QuantityLength(
                        2,
                        LengthUnit.CENTIMETER);

        assertEquals(cm1, cm2);
    }
    @Test
    void testEquality_CentimeterToInch() {

        QuantityLength cm =
                new QuantityLength(
                        1,
                        LengthUnit.CENTIMETER);

        QuantityLength inch =
                new QuantityLength(
                        0.393701,
                        LengthUnit.INCH);

        assertEquals(cm, inch);
    }
    @Test
    void testEquality_CentimeterToFeet_NonEquivalent() {

        QuantityLength cm =
                new QuantityLength(
                        1,
                        LengthUnit.CENTIMETER);

        QuantityLength feet =
                new QuantityLength(
                        1,
                        LengthUnit.FEET);

        assertNotEquals(cm, feet);
    }
    @Test
    void testEquality_MultiUnit_TransitiveProperty() {

        QuantityLength yard =
                new QuantityLength(
                        1,
                        LengthUnit.YARD);

        QuantityLength feet =
                new QuantityLength(
                        3,
                        LengthUnit.FEET);

        QuantityLength inch =
                new QuantityLength(
                        36,
                        LengthUnit.INCH);

        assertEquals(yard, feet);

        assertEquals(feet, inch);

        assertEquals(yard, inch);
    }
    @Test
    void testEquality_AllUnits_ComplexScenario() {

        QuantityLength yard =
                new QuantityLength(
                        2,
                        LengthUnit.YARD);

        QuantityLength feet =
                new QuantityLength(
                        6,
                        LengthUnit.FEET);

        QuantityLength inch =
                new QuantityLength(
                        72,
                        LengthUnit.INCH);

        assertEquals(yard, feet);

        assertEquals(feet, inch);

        assertEquals(yard, inch);
    }
    @Test
    void testConversion_FeetToInches() {

        double result =
                QuantityLength.convert(
                        1,
                        LengthUnit.FEET,
                        LengthUnit.INCH);

        assertEquals(
                12,
                result,
                0.0001);
    }
    @Test
    void testConversion_InchesToFeet() {

        double result =
                QuantityLength.convert(
                        24,
                        LengthUnit.INCH,
                        LengthUnit.FEET);

        assertEquals(
                2,
                result,
                0.0001);
    }
    @Test
    void testConversion_YardsToInches() {

        double result =
                QuantityLength.convert(
                        1,
                        LengthUnit.YARD,
                        LengthUnit.INCH);

        assertEquals(
                36,
                result,
                0.0001);
    }
    @Test
    void testConversion_CentimetersToInches() {

        double result =
                QuantityLength.convert(
                        2.54,
                        LengthUnit.CENTIMETER,
                        LengthUnit.INCH);

        assertEquals(
                1.0,
                result,
                0.001);
    }
    @Test
    void testConversion_ZeroValue() {

        double result =
                QuantityLength.convert(
                        0,
                        LengthUnit.FEET,
                        LengthUnit.INCH);

        assertEquals(
                0,
                result,
                0.0001);
    }
    @Test
    void testConversion_NegativeValue() {

        double result =
                QuantityLength.convert(
                        -1,
                        LengthUnit.FEET,
                        LengthUnit.INCH);

        assertEquals(
                -12,
                result,
                0.0001);
    }
    @Test
    void testConversion_RoundTrip_PreservesValue() {

        double original = 15.5;

        double inches =
                QuantityLength.convert(
                        original,
                        LengthUnit.FEET,
                        LengthUnit.INCH);

        double feet =
                QuantityLength.convert(
                        inches,
                        LengthUnit.INCH,
                        LengthUnit.FEET);

        assertEquals(
                original,
                feet,
                0.0001);
    }
    @Test
    void testConversion_InvalidUnit_Throws() {

        assertThrows(
                IllegalArgumentException.class,
                () -> QuantityLength.convert(
                        1,
                        null,
                        LengthUnit.FEET));
    }
    @Test
    void testConversion_NaN_Throws() {

        assertThrows(
                IllegalArgumentException.class,
                () -> QuantityLength.convert(
                        Double.NaN,
                        LengthUnit.FEET,
                        LengthUnit.INCH));
    }
    @Test
    void testConversion_Infinite_Throws() {

        assertThrows(
                IllegalArgumentException.class,
                () -> QuantityLength.convert(
                        Double.POSITIVE_INFINITY,
                        LengthUnit.FEET,
                        LengthUnit.INCH));
    }
    @Test
    void testAddition_SameUnit_FeetPlusFeet() {

        QuantityLength result =
                QuantityLength.add(

                        new QuantityLength(
                                1,
                                LengthUnit.FEET),

                        new QuantityLength(
                                2,
                                LengthUnit.FEET)
                );

        assertEquals(

                new QuantityLength(
                        3,
                        LengthUnit.FEET),

                result);
    }
    @Test
    void testAddition_SameUnit_InchPlusInch() {

        QuantityLength result =
                QuantityLength.add(

                        new QuantityLength(
                                6,
                                LengthUnit.INCH),

                        new QuantityLength(
                                6,
                                LengthUnit.INCH)
                );

        assertEquals(

                new QuantityLength(
                        12,
                        LengthUnit.INCH),

                result);
    }
    @Test
    void testAddition_CrossUnit_FeetPlusInches() {

        QuantityLength result =
                QuantityLength.add(

                        new QuantityLength(
                                1,
                                LengthUnit.FEET),

                        new QuantityLength(
                                12,
                                LengthUnit.INCH)
                );

        assertEquals(

                new QuantityLength(
                        2,
                        LengthUnit.FEET),

                result);
    }
    @Test
    void testAddition_CrossUnit_InchPlusFeet() {

        QuantityLength result =
                QuantityLength.add(

                        new QuantityLength(
                                12,
                                LengthUnit.INCH),

                        new QuantityLength(
                                1,
                                LengthUnit.FEET)
                );

        assertEquals(

                new QuantityLength(
                        24,
                        LengthUnit.INCH),

                result);
    }
    @Test
    void testAddition_CrossUnit_YardPlusFeet() {

        QuantityLength result =
                QuantityLength.add(

                        new QuantityLength(
                                1,
                                LengthUnit.YARD),

                        new QuantityLength(
                                3,
                                LengthUnit.FEET)
                );

        assertEquals(

                new QuantityLength(
                        2,
                        LengthUnit.YARD),

                result);
    }
    @Test
    void testAddition_CrossUnit_CentimeterPlusInch() {

        QuantityLength result =
                QuantityLength.add(

                        new QuantityLength(
                                2.54,
                                LengthUnit.CENTIMETER),

                        new QuantityLength(
                                1,
                                LengthUnit.INCH)
                );

        assertEquals(

                new QuantityLength(
                        5.08,
                        LengthUnit.CENTIMETER),

                result);
    }
    @Test
    void testAddition_WithZero() {

        QuantityLength result =
                QuantityLength.add(

                        new QuantityLength(
                                5,
                                LengthUnit.FEET),

                        new QuantityLength(
                                0,
                                LengthUnit.INCH)
                );

        assertEquals(

                new QuantityLength(
                        5,
                        LengthUnit.FEET),

                result);
    }
    @Test
    void testAddition_NegativeValues() {

        QuantityLength result =
                QuantityLength.add(

                        new QuantityLength(
                                5,
                                LengthUnit.FEET),

                        new QuantityLength(
                                -2,
                                LengthUnit.FEET)
                );

        assertEquals(

                new QuantityLength(
                        3,
                        LengthUnit.FEET),

                result);
    }
    @Test
    void testAddition_NullSecondOperand() {

        assertThrows(
                IllegalArgumentException.class,

                () -> QuantityLength.add(

                        new QuantityLength(
                                1,
                                LengthUnit.FEET),

                        null
                ));
    }
    @Test
    void testAddition_LargeValues() {

        QuantityLength result =
                QuantityLength.add(

                        new QuantityLength(
                                1_000_000,
                                LengthUnit.FEET),

                        new QuantityLength(
                                1_000_000,
                                LengthUnit.FEET)
                );

        assertEquals(

                new QuantityLength(
                        2_000_000,
                        LengthUnit.FEET),

                result);
    }
    @Test
    void testAddition_SmallValues() {

        QuantityLength result =
                QuantityLength.add(

                        new QuantityLength(
                                0.001,
                                LengthUnit.FEET),

                        new QuantityLength(
                                0.002,
                                LengthUnit.FEET)
                );

        assertEquals(

                new QuantityLength(
                        0.003,
                        LengthUnit.FEET),

                result);
    }
}