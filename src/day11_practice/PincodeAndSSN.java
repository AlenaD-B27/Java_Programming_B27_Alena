package day11_practice;

import java.util.Scanner;

public class PincodeAndSSN {
    public static void main(String[] args) {
//        declare and assign two expected numbers:
//        pincode: 1234
//        ssn: 1111
//
//        ask the user to enter the two numbers and compare them with the system values defined above. If they match print Authentication successful
//
//        if they don't match print all the reasons that authentication failed:
//
//        if the pincode was incorrect print: Pin Code is incorrect
//        if the ssn was incorrect print: Last 4 SSN numbers are incorrect
//
//        ------------------------------------------------------------------------

        Scanner input = new Scanner(System.in);
        int expectedPin = 1234;
        int expectedSSN = 1111;
        System.out.println("Enter Pin:");
        int entrPin = input.nextInt();
        System.out.println("Enter the last 4 digits of SSN:");
        int entrSSN = input.nextInt();
        boolean authenticationPass = expectedPin == entrPin && expectedSSN == entrSSN;

        if(authenticationPass){
            System.out.println("Authentication successful");
        }else{
            if(entrPin != expectedPin){
                System.out.println("Pin Code is incorrect");
            }else{
                System.out.println("Last 4 SSN numbers are incorrect");
            }


        }








    }
}
