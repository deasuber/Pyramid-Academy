package com.company;
import  java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 19 + 1);

        System.out.println("Hello! What is your name?");
        String name = in.next();


        System.out.println(" Well," + name + ", I am thinking of a number between 1 and 20. ");

        //System.out.println("Secret number is " + secretNumber);
        Scanner scanner = new Scanner(System.in);


        int guess = 0;
        int count;
        for (count = 0; count < 6; count++) {

            System.out.print("Take a guess.  ");

            guess = scanner.nextInt();

            System.out.println("Your guess is " + guess);
            if (guess == secretNumber) {
                break;
            } else if (guess < secretNumber) {
                System.out.println("Your guess is too low.");
            } else if (guess > secretNumber) {
                System.out.println("Your guess is too high.");
            }

        }
        if (guess == secretNumber) {
            count+=1;
            System.out.println("Good job, " + name + " You guessed my number in " + count + " guesses!\n" + "Would you like to play again? (y or n)");

        }
        if (count == 6) {
            System.out.println("So sorry you exhausted " + "6 trials.\n" + "Secret number is " + secretNumber);
        }
    }
}

