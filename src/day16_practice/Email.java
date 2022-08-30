package day16_practice;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {


//        [Creating an email]
//
//Ask user to enter two strings.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter line 1:");
        String str1 = input.next().toLowerCase();
        System.out.println("Enter line 2:");
        String str2 = input.next().toLowerCase();
// Both strings should be at least 6 character long. If they are shorter than that print “Invalid data” and program should end.
        if(str1.length() < 6 || str2.length() < 6){
            System.out.println("Invalid data.");
        }
//
//If the information provided is valid, you will take the first 4 characters of first string and combine them with the last three characters of the second string. At the end of your combined string add “@cydeo.com” and print the final string as your created email.
//The final email should be in all lowercase.

        // privet
        // 012345
        else{
            int whereIndex = (str2.length() - 3);
            String email = new String (str1.substring(0,4) + str2.substring(whereIndex) + "@cydeo.com");
            System.out.println("email = " + email);
        }

//
//    input:
//        JamesBond
//        Secret
//    output:
//        jameret@cydeo.com
//










    }
}
