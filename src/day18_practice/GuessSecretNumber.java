package day18_practice;

import java.util.Scanner;

public class GuessSecretNumber {
    public static void main(String[] args) {
        //    write a program that will allow you to guess a secret number.
//    Define a number in the code in a specific range, for example 1-100. Then the program is for the user to guess that number
//    They will guess a number and get a response. They can keep guessing until they get is right
//    give hints:
//    number is bigger
//    number is smaller
//
//    bonus: keep track of the number of attempts it took to guess the number
        Scanner input = new Scanner(System.in);
        int secretNum = 7;
        int guess = input.nextInt();
        int attempts = 0;

        if(guess == secretNum) {
            attempts++;
            System.out.println("Correct!");
            System.out.println("Number of attempts: " + attempts);
        }


        while (guess != secretNum) {
            attempts++;
            if (guess > secretNum) {
                System.out.println("number is smaller");
                System.out.println("Number of attempts: " + attempts);
                guess = input.nextInt();
            } else if (guess < secretNum){
                System.out.println("number is bigger");
                System.out.println("Number of attempts: " + attempts);
                guess = input.nextInt();
            } else {
                System.out.println("Correct!");
                System.out.println("Number of attempts: " + attempts);

            }
            if(guess == secretNum) {
                attempts++;
                System.out.println("Correct!");
                System.out.println("Number of attempts: " + attempts);
            }





        }


    }
}
