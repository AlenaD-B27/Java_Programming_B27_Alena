package day27_practice;

import java.util.Scanner;

public class PositiveOrNegative {
    /*
    create a method that will accept a number. Find and print if it is a positive number, negative number, or zero
     */
    public static void number(int num){

        if(num > 0){
            System.out.println("Positive");
        }else if(num == 0){
            System.out.println("Zero");
        }else{
            System.out.println("Negative");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner input = new Scanner(System.in);
        number(input.nextInt());
    }






}
