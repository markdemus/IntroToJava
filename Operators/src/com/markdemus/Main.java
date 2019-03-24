package com.markdemus;

public class Main {

    public static void main(String[] args) {


	    boolean isAlien = false;
	    if (isAlien == true);
	        System.out.println("It is not an Alien");
	    int topScore = 95;
	    if(topScore != 95);
	        System.out.println("You got the top score!");
	    int secondTopScore = 90;
        if ((topScore > secondTopScore) && (topScore < 100));
        System.out.println("Greater than second top score, but less than 100");

        if ((topScore > 90) || (secondTopScore <= 90));
        System.out.println("One of these is true");

        int newValue = 50;
        if(newValue == 50);
        System.out.println("This is true");

        boolean isCar = false;
        if(isCar == true)
            System.out.println("This is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar);
        System.out.println("wasCar is true");

        //challenge
        double myDoubleValue = 20d;
        double myDoubleValueTwo = 80d;

        double result = (myDoubleValue + myDoubleValueTwo) * 25;
        System.out.println(result);
        double previousResult = result;

        result = result % 40;
        System.out.println(previousResult + " divided by 40 = " + result);

        if (result <= 20)
            System.out.println("Total was over the limit.");









    }
}
