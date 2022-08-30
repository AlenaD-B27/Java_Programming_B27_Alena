package day30_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ValidPassword {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        boolean valid = false;

while (valid == false) {
    do {
        System.out.println("Please, enter password:");
        String password = input.nextLine();


        if (password.length() >= 8) {
            valid = true;
        } else {
            valid = false;
        }

        if (valid == false) {
            System.out.println("Invalid password. Must have at least 8 characters.");
            break;
        }

        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                valid = true;
                break;
            } else {
                valid = false;
            }
        }

        if (valid == false) {
            System.out.println("Invalid password. Must have at least 1 uppercase letter ");
            break;
        }

        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                valid = true;
                break;
            } else {
                valid = false;
            }
        }

        if (valid == false) {
            System.out.println("Invalid password. Must have at least 1 lowercase letter ");
            break;
        }

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                valid = true;
                break;
            } else {
                valid = false;
            }
        }

        if (valid == false) {
            System.out.println("Invalid password. Must have at least 1 number ");
            break;
        }

        //        Must have one of the follow special characters:
        //        ! @ # $ % ^ & *

        String listOfChars = "!@#$%^&*";

        for (int i = 0; i < password.length(); i++) {
            for (int j = 0; j < listOfChars.length(); j++) {
                if (password.charAt(i) == listOfChars.charAt(j)) {
                    valid = true;
                    break;
                } else {
                    valid = false;
                }
            }
        }

            if (valid == false) {
                System.out.println("Invalid password. Must have one of the following special characters: " + listOfChars);
                valid = false;
                break;
            }



    }
    while (valid == false);

}

if (valid == true){
    System.out.println("Password is accepted");
}













        }
    }

