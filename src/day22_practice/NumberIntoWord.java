package day22_practice;

import java.util.Scanner;

public class NumberIntoWord {
    /*
    Create a program that will ask the user to enter a number and print the number as a word. Set a range from 0 - 15 and any number not in the range should get an invalid number message

    Ex:
> 1
        one

> 10
        ten
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input number:");
        int num = input.nextInt();

        String number[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen"};

        if (num < 1 || num > 15){
            System.out.println("Invalid number");
        }else{
            System.out.println(number[num-1]);
        }














    }








}
