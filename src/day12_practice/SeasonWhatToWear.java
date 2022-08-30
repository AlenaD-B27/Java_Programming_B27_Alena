package day12_practice;

import java.util.Scanner;

public class SeasonWhatToWear {
    public static void main(String[] args) {
//        Season Finder
//        declare and assign a month number. Bases on the below data determine what
//        season it is and what kind of clothes to wear. You can create your own
//        expectations of what kind of clothes to wear based on the month
//        12, 1, 2 --> Winter
//        3, 4, 5 --> Spring
//        6, 7, 8 --> Summer
//        9, 10, 11 --> Fall
//        Ex:
//        2
//        It is winter, so wear a winter coat, gloves and a hat
//                -----------------------------------------------------------
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of the month:");
        int month = input.nextInt();

        switch(month){
            case 12: case 1: case 2:
                System.out.println("It is winter, wear the hat, scarf, coat,gloves and warm boots.");
                break;
            case 3: case 4: case 5:
                System.out.println("It is spring, wear the hoodie and pants.");
                break;
            case 6: case 7: case 8:
                System.out.println("It is summer, wear shorts and crop top.");
                break;
            case 9: case 10: case 11:
                System.out.println("It is fall, wear a t-shirt and shorts, have hoodie or denim jacket with you in case if it gets colder at night time.");
                break;
            default:
                System.out.println("Enter valid number (from 1 to 12)");
        }













    }
}
