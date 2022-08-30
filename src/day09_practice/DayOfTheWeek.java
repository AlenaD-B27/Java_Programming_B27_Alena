package day09_practice;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
//        create a number to represent the day. (1 being Monday and 7 being Sunday)
//        Print the day related to the number
//
//        Ex:
//        2
//        Tuesday
//
//        Ex:
//        5
//        Friday
//                ________________________________________________________________________

        System.out.println("Enter number of the day:");
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();

        if(day == 1){
            System.out.println("Monday");
        }else if(day == 2){
            System.out.println("Tuesday");
        }else if(day == 3){
            System.out.println("Wednesday");
        }else if(day == 4){
            System.out.println("Thursday");
        }else if(day == 5){
            System.out.println("Friday");
        }else if(day == 6){
            System.out.println("Saturday");
        }else if(day == 7){
            System.out.println("Sunday");
        }else{
            System.out.println("ERROR");
        }





    }
}
