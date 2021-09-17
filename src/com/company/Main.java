package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Random ranGen = new Random();
        Scanner uInput = new Scanner(System.in);
        int Guesses = 5;
        int Win = 0;
        int ranNum = ranGen.nextInt(16);
        System.out.println(ranNum);
        while (Guesses > 0) {
            Guesses--;
            System.out.println("Guess a number between 0 - 15:");
            int guessedNum = uInput.nextInt();
            if (guessedNum == ranNum) {
                System.out.println("Correct!\nYou did it in " + (5 - Guesses) + " guesses");
                Win = 1;
                break;
            }
            int diff = (ranNum - guessedNum) * (ranNum - guessedNum);
            if (diff <= 4) {
                System.out.println("Hot");
            }
            else if (diff <=36) {
                System.out.println("Warm");
            }
            else {
                System.out.println("Cold");
            }
            System.out.println("");
        }
        if (Win == 0) {
            System.out.println("Unfortunately you didn't win.\nThe number was " + ranNum);
        }
    }
}
