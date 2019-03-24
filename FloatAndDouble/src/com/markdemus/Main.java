package com.markdemus;

public class Main {

    public static void main(String[] args) {
        // width of int - 32 (4 bytes).
        int myIntValue = 5;
        //width of float = 32 (4 bytes).
        float myFloatValue = 5f;
        //width of double is 64 (8 bytes).
        double myDoubleValue = 5d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //challenge of pounds to kilos. 1 pound = 0.45359237.

        double numPounds = 165d;
        double convertedKilograms = numPounds * 0.4359237d;
        System.out.println("Kilograms = " + convertedKilograms);



    }
}
