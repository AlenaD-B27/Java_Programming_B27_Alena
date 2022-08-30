package day15_practice;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        /*
        create a program to ask the user to enter their first name and last name.
Then print the initials of the person in uppercase format.
The intials are made up of the first letters of the first and last names.

	Ex:
		james
		bond

		JB

	Ex:
		anna
		lee

		AL
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = input.next().toUpperCase();
        System.out.println("Enter your last name:");
        String lastName = input.next().toUpperCase();
        String initials = firstName.substring(0,1) + lastName.substring(0,1);
        System.out.println(initials);



    }
}
