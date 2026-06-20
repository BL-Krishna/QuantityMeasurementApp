package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {
    public static class Feet {

        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) {
                return true;
            }

            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            Feet feet = (Feet) obj;

            return Double.compare(value, feet.value) == 0;
        }
    }
    public static class Inches {

        private final double value;

        public Inches(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj)
                return true;

            if (obj == null || getClass() != obj.getClass())
                return false;

            Inches inches = (Inches) obj;

            return Double.compare(value, inches.value) == 0;
        }
    }
    public static boolean checkInchesEquality(double value1,
                                              double value2) {

        Inches inch1 = new Inches(value1);
        Inches inch2 = new Inches(value2);

        return inch1.equals(inch2);
    }



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

    public static void demonstrateLengthConversion(
            double value,
            LengthUnit from,
            LengthUnit to) {

        double result =
                QuantityLength.convert(
                        value,
                        from,
                        to);

        System.out.println(
                value + " " + from +
                        " = " +
                        result + " " + to);
    }

    public static void demonstrateLengthConversion(
            QuantityLength length,
            LengthUnit targetUnit) {

        QuantityLength converted =
                length.convertTo(targetUnit);

        System.out.println(
                length +
                        " = " +
                        converted);
    }

    public static void main(String[] args) {

        Feet firstFeet = new Feet(1.0);
        Feet secondFeet = new Feet(1.0);

        System.out.println(
                checkEquality(
                        1,
                        LengthUnit.YARD,
                        3,
                        LengthUnit.FEET));

        System.out.println(
                checkEquality(
                        1,
                        LengthUnit.YARD,
                        36,
                        LengthUnit.INCH));

        System.out.println(
                checkEquality(
                        1,
                        LengthUnit.CENTIMETER,
                        0.393701,
                        LengthUnit.INCH));
        demonstrateLengthConversion(
                1,
                LengthUnit.FEET,
                LengthUnit.INCH);

        demonstrateLengthConversion(
                3,
                LengthUnit.YARD,
                LengthUnit.FEET);

        demonstrateLengthConversion(
                36,
                LengthUnit.INCH,
                LengthUnit.YARD);

        demonstrateLengthConversion(
                2.54,
                LengthUnit.CENTIMETER,
                LengthUnit.INCH);
        demonstrateLengthAddition(

                new QuantityLength(
                        1,
                        LengthUnit.FEET),

                new QuantityLength(
                        12,
                        LengthUnit.INCH)
        );

        demonstrateLengthAddition(

                new QuantityLength(
                        1,
                        LengthUnit.YARD),

                new QuantityLength(
                        3,
                        LengthUnit.FEET)
        );
        demonstrateLengthAddition(

                new QuantityLength(
                        1,
                        LengthUnit.FEET),

                new QuantityLength(
                        12,
                        LengthUnit.INCH),

                LengthUnit.FEET);



        demonstrateLengthAddition(

                new QuantityLength(
                        1,
                        LengthUnit.FEET),

                new QuantityLength(
                        12,
                        LengthUnit.INCH),

                LengthUnit.INCH);



        demonstrateLengthAddition(

                new QuantityLength(
                        1,
                        LengthUnit.FEET),

                new QuantityLength(
                        12,
                        LengthUnit.INCH),

                LengthUnit.YARD);
    }
    public static void demonstrateLengthAddition(
            QuantityLength first,
            QuantityLength second) {

        QuantityLength result =
                first.add(second);

        System.out.println(
                first +
                        " + " +
                        second +
                        " = " +
                        result);
    }
    public static void demonstrateLengthAddition(
            double value1,
            LengthUnit unit1,
            double value2,
            LengthUnit unit2) {

        QuantityLength result =
                QuantityLength.add(
                        value1,
                        unit1,
                        value2,
                        unit2);

        System.out.println(result);
    }
    public static void demonstrateLengthAddition(

            QuantityLength first,

            QuantityLength second,

            LengthUnit targetUnit) {

        QuantityLength result =
                QuantityLength.add(
                        first,
                        second,
                        targetUnit);

        System.out.println(

                first +
                        " + " +
                        second +
                        " = " +
                        result);
    }



}