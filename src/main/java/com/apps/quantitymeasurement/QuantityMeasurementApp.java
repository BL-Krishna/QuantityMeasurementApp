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

        @Override
        public boolean equals(Object obj) {

            if (this == obj)
                return true;

            if (obj == null || getClass() != obj.getClass())
                return false;

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

    public static boolean checkFeetEquality(double value1,
                                            double value2) {

        Feet feet1 = new Feet(value1);
        Feet feet2 = new Feet(value2);

        return feet1.equals(feet2);
    }

    public static boolean checkInchesEquality(double value1,
                                              double value2) {

        Inches inch1 = new Inches(value1);
        Inches inch2 = new Inches(value2);

        return inch1.equals(inch2);
    }

    public static void main(String[] args) {

        System.out.println(
                "Feet Equality : "
                        + checkFeetEquality(1.0, 1.0));

        System.out.println(
                "Inches Equality : "
                        + checkInchesEquality(1.0, 1.0));
    }
}