package day14_practice;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {

    /*
    Intro String Tasks
-----------------------------------------------------------

Declare and assign a String
print the String in all uppercase format and
print the String in all lowercase format

-----------------------------------------------------------

Declare and assign a String for password
the password should be more than 8 character long
print: Valid password or Invalid password

-----------------------------------------------------------

Use scanner to read a String from the console
Remove extra spaces in the beginning or end
Print in all lowercase
Print the number of characters

-----------------------------------------------------------
     */

      String first = new String("String is a Method");
        System.out.println(first.toUpperCase());
        System.out.println(first.toLowerCase());

        System.out.println("===================================");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter new password:");
        String inputPassword = input.nextLine();

        if(inputPassword.length()>=8 ) {


        } else {
            System.out.println("Password should have 8 or more characters, try again.");
            inputPassword = input.nextLine();
            if(inputPassword.length()>=8 ) {
               }

        }

        String savedPassword = new String(inputPassword);

        System.out.println("Enter saved password:");
        String inputPasswordAfterSaving = input.nextLine();

        if(inputPasswordAfterSaving.length()>=8 ) {
            if (inputPasswordAfterSaving.equals(savedPassword)) {
                System.out.println("VALID");
            } else {
                System.out.println("Password is INVALID");
            }


        } else {
            System.out.println("Password should have 8 or more characters");
        }

        System.out.println("=========================================");

        String newTask = input.nextLine();
        newTask = newTask.trim();
        System.out.println(newTask.toLowerCase());
        System.out.println(newTask.length());



















    }
}
