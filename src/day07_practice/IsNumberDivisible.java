package day07_practice;
import java.util.Scanner;
public class IsNumberDivisible {
    public static void main(String[] args) {
        //                Create a program that will ask the user to enter a number. Check if that number is evenly divisible by 2, 3, and 5. Print the boolean values
//
//        Ex:
//        Enter a number
//        65
//
//        65 is divisible by 2: false
//        65 is divisible by 3: false
//        65 is divisible by 5: true
        System.out.println("Enter the number:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        boolean isDevBy2 = number%2 == 0;
        boolean isDevBy3 = number%3 == 0;
        boolean isDevBy5 = number%5 == 0;
        System.out.println("isDevBy2 = " + isDevBy2);
        System.out.println("isDevBy3 = " + isDevBy3);
        System.out.println("isDevBy5 = " + isDevBy5);








    }
}
