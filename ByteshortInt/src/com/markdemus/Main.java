package com.markdemus;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        int myMinValue= -2_147_483_648;
        int myMaxValue= 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println(myTotal);

        // byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);
        byte myChallengeByteValue = -110;
        byte myNewChallengeByteValue = (byte) (myChallengeByteValue + 2);
        System.out.println(myNewChallengeByteValue);

        // short has a width of 16
        short myShortValue = -32768;
        short myNewShortValue = (short) (myShortValue/2);
        short myChallengeShortValue = 2000;
        short myNewChallengeShortValue = (short) (myChallengeShortValue + 1000);
        System.out.println(myNewChallengeShortValue);

        // long has a width of 64
        long myLongValue = -9_223_372_036_854_775_808L;
        long myChallengeLongValue = 5000;
        long myNewChallengeLongValue = (long) (myChallengeLongValue + (10 * myNewChallengeByteValue) + (myNewChallengeShortValue) + myTotal);
        System.out.println(myNewChallengeLongValue);
    }
}
