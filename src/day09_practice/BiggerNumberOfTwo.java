package day09_practice;

import java.util.Scanner;

public class BiggerNumberOfTwo {
    public static void main(String[] args) {
//        Create two number variables
//        Find and print which number is bigger between the two
//
//        ex:
//        50
//        45
//
//        output:
//        50 is bigger
//        ________________________________________________________________________

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
int num = input.nextInt();
        System.out.println("Enter one more number:");
        int num1 = input.nextInt();

if(num > num1 == true){
    System.out.println(num + " is bigger");
} else if (num1 > num == true) {
    System.out.println(num1 + " is bigger");
} else {
    System.out.println("numbers are equal");
}





    }
}
