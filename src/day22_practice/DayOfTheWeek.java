package day22_practice;

import java.util.Scanner;

public class DayOfTheWeek {
    /*
    Create a program that will ask the user to enter a number for the day of the week. Print the day of the week based on:

    1 - Monday
    2 - Tuesday
    ...
    7 - Sunday

Use array, not if statement or switch

---------------------------------------------------------------------------
     */
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
        System.out.println("Enter number of the day:");
        int num = input.nextInt();
        String day[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
           if(num > 0 && num <= 7){
               System.out.println(day[num - 1]);
           }else{
               System.out.println("Invalid number");
           }

        System.out.println("======================================");

        String finalAnswer = "";
        boolean invalid = false;

        for (int i = 0; i >= 0; i++) {
            System.out.println("Enter number of the day:");
            num = input.nextInt();




            if(num > 0 && num <= day.length){       // instead of day.length I could really just put 7, BUT what if
                                                    //  something happens, and we will have 8,9 or more days in a week.
                System.out.println(day[num - 1]);
                if (finalAnswer.contains(day[num-1])){
                    System.out.println("You have already chosen this day.");
                    continue;
                }else{finalAnswer += day[num-1]; }       // for example on the other planets we have different
                                                           // time counts. I mean, I am just playing with logics.
            }else{
                invalid = true;
                System.out.println("Invalid number");



               }

            System.out.println("Would you like to choose one more day?");
            String answer = input.next();


            if(invalid == true){
                finalAnswer = finalAnswer.substring(0, finalAnswer.length()-2);
            }


            if(answer.equals("no")){
                finalAnswer += ".";
                System.out.println("You chose: " + finalAnswer);
                break;
            }else if(answer.equals("yes")){
                finalAnswer += ", ";
            }else {
                System.out.println("Invalid answer!!!");
                finalAnswer += ".";
                System.out.println("You chose: " + finalAnswer);
                break;
            }

        }























    }













}
