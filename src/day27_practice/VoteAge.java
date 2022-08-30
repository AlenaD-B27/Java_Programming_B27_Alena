package day27_practice;

import java.util.Scanner;

public class VoteAge {
    /*
    create a method that will accept an age and determine if the person is eligible to vote. Person must be 18 years or older to vote
     */
    public static void votePermit(int age){
        if(age >= 18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Too young, not eligible to vote");
        }
    }


    public static void main(String[] args) {
        System.out.println("Enter your age, please:");
        Scanner input = new Scanner(System.in);
        votePermit(input.nextInt());
    }
}
