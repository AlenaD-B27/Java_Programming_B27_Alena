package day07_practice;

import java.util.Scanner;
public class Revenue {
    public static void main(String[] args) { // main method turns on the console == we can run the code
//        Create a program that will ask the user to enter a price and quantity and then calculate the revenue. revenue = price × quantity.
        Scanner input = new Scanner(System.in); // created the Scanner object
        System.out.println("Enter price: "); // it will print Enter price:
        double price = input.nextDouble(); // we declare price and assign price to manual input
        System.out.println("Enter quantity: "); // it will print Enter quantity:
        int q = input.nextInt(); // we declare variable q and assign it to the manual integer input
        double revenue = price * q; // declare the variable revenue and assign it to the price-times-q
        System.out.println("revenue = " + revenue); // it will print "revenue = revenue value"


      int c =  someMethod(25,5);


    }


    public static int someMethod(int a, int b) {
        return a + b;
    }

}