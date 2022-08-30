package day18_practice;

import java.util.Scanner;

public class CountPositiveAndNegatives {
    public static void main(String[] args) {
        //    write a program that will ask the user to enter 5 numbers and print how many were positive and how many were negative
//
        Scanner input = new Scanner(System.in);
        int loop = 0;
        int inputNumber;
        int positives = 0;
        int negatives = 0;

        while (loop < 5){
            inputNumber = input.nextInt();
            loop++;
            if(inputNumber > 0){
                positives++;
            }else if(inputNumber < 0){
                negatives++;
            }else{}
        }
        System.out.println("positives = " + positives);
        System.out.println("negatives = " + negatives);
    }
}
