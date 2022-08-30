package day09_practice;

import java.util.Scanner;

public class TimeOfTheDay {
    public static void main(String[] args) {
//
//        create an int value for the time of the day. Use a 24 hour format
//        use the given time of day to display a message
//        hint: use seperate if statements
//
//        if the hours are from 6 - 11, print: Good morning
//        if the hours are from 12 - 16, print: Good evening
//        if the hours are from 17 - 23 or 0 - 5, print: Good night
//
//        ________________________________________________________________________
        Scanner input = new Scanner(System.in);
        int now = input.nextInt();

        if (now >= 6 && now <= 11){
            System.out.println("Good morning");
        }else if(now >= 12 && now <= 16){
            System.out.println("Good evening");
        }else{
            System.out.println("Good night");
        }














    }
}
