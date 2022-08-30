package day11_practice;

import java.util.Scanner;

public class PincodeAndSSN_1moreVariant {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int expectedPin = 1234;
        int expectedSSN = 1111;
        System.out.println("Enter Pin:");
        int entrPin = input.nextInt();
        if (entrPin != expectedPin){
            System.out.println("Incorrect Pin Code");
        }else {
            System.out.println("Enter the last 4 digits of SSN:");
            int entrSSN = input.nextInt();
            if(entrSSN != expectedSSN){
                System.out.println("Wrong SSN");
            }else{
                System.out.println("Authentication Successful");
            }
        }













    }
}
