package day11_practice;


import java.util.Scanner;

public class CostOfMovie {
    public static void main(String[] args) {
//        The length of the movie will determine how much it costs.
//                declare and assign a variable for the duration of the movie
//        The length will be given as a decimal as hours.minutes
//
//        duration of less than or equal to 0:
//        Movies cannot be less than 0 minutes
//        duration of more than 4:
//        Movies cannot be more than 4 hours
//
//        for all other duration uses the following values to display the price of the tickets
//
//        duration 	--> price
//        1.0 		--> 8.99
//        1.5 		--> 10.50
//        2.0 		--> 12.99
//        2.5 		--> 14.50
//        3, 3.5 or 4 --> 15.99
//
//                ------------------------------------------------------------------------

        Scanner input = new Scanner(System.in);
        System.out.println("Duration of the movie:");
        double howLong = input.nextDouble();
        boolean movieHappens = howLong >= 0 && howLong < 4;


        if(movieHappens){

            if(howLong == 1.0){
                System.out.println(8.99);
            }else if(howLong == 1.5){
                System.out.println(10.50);
            }else if(howLong == 2.0){
                System.out.println(12.99);
            }else if(howLong == 2.5){
                System.out.println(14.50);
            }else if(howLong == 3 || howLong == 3.5 || howLong == 4){
                System.out.println(15.99);
            }else{
                System.out.println("We do not have the movie of this length.");
            }



        }else{

            if(howLong < 0){
            System.out.println("Movies cannot be less than 0 minutes");
        }else{
                System.out.println("Movies cannot be more than 4 hours");
            }




    }
}}
