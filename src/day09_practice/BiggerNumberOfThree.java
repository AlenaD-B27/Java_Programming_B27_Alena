package day09_practice;

import java.util.Scanner;

public class BiggerNumberOfThree {
    public static void main(String[] args) {


//        Create three number variables
//        Find and print which number is bigger between the three
//
//        ex:
//        50
//        45
//        100
//
//        output:
//        100 is the biggest
//
//                ________________________________________________________________________
Scanner input = new Scanner(System.in);
        System.out.println("enter the first number:");
int a = input.nextInt();
        System.out.println("enter the second number:");
int b = input.nextInt();
        System.out.println("enter the third number:");
int c = input.nextInt();
boolean isA = a > b && a > c;
boolean isB = b > a && b > c;
boolean isC = c > a && c > b;
boolean isAnB = a == b && a > c;
boolean isAnC = a == c && a > b;
boolean isBnC = b == c && b > a;
boolean equal = a == b && b == c;

if(isA){
    System.out.println(a + " is the biggest");
}else if(isB){
    System.out.println(b + " is the biggest");
}else if(isC){
    System.out.println(c + " is the biggest");
}else if(isAnB){
    System.out.println(a + " and " + b + " are the biggest");
}else if(isAnC){
    System.out.println(a + " and " + c + " are the biggest");
}else if(isBnC){
    System.out.println(b + " and " + c + " are the biggest");
}else if(equal){
    System.out.println("all 3 numbers are equal");
}













    }
}
