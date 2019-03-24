package com.markdemus;

public class Main {

    public static void main(String[] args) {
	// challenge
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if(gameOver) {
            int finalScore = score + (levelCompleted + bonus);
            System.out.println("You can do better");
        }

        boolean gameOverAgain = true;
        int scoreAgain = 10000;
        int levelCompletedAgain = 8;
        int bonusAgain = 200;

        if(gameOverAgain) {
            int finalScore = scoreAgain + (levelCompletedAgain + bonusAgain);
            System.out.println("Job well done");
        }
    }
}
