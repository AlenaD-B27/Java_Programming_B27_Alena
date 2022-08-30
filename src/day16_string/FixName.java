package day16_string;

import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        /*
        ask the user to enter their first name
        ask the user to enter their last name

        print both names in proper format
         */

        Scanner input = new Scanner(System.in);

        System.out.println("enter your first name:");
        String first = input.next().toLowerCase();
        System.out.println("enter your last name:");
        String last = input.next().toLowerCase();

        first = first.substring(0,1).toUpperCase() + first.substring(1);
        last = last.substring(0,1).toUpperCase() + last.substring(1);
        System.out.println(first + " " + last);











    }
}
