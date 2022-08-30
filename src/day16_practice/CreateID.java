package day16_practice;

import java.util.Scanner;

public class CreateID {
    public static void main(String[] args) {
        /*
        [Create ID]

Given a first name and last name create and return an id using the following format:
    the first letter of the first name as lowercase,
    the first 3 letters of the last name with the first letter as uppercase and the rest lowercase,
    the length of the first String multiplied by 2

    first name: john
    last name: smith

    id: jSmi8

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first name:");
        String fName = input.next();
        System.out.println("Enter the last name");
        String lName = input.next();
        int num = fName.length()*2;


        String id = new String(fName.substring(0,1).toLowerCase() + lName.substring(0,1).toUpperCase() + lName.substring(1,3) + num);
        System.out.println("id = " + id);









    }
}
