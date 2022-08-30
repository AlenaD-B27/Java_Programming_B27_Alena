package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {


        // OLDER APPROACH: use add method

//        ArrayList<String> drinks = new ArrayList<>();
//        drinks.add("Soda");
//        drinks.add("Juice");
//        drinks.add("Water");
//        drinks.add("Coffee");
//        System.out.println(drinks);

        Scanner input = new Scanner(System.in);

        ArrayList<String> drinks = new ArrayList<>(Arrays.asList("Soda", "Juice", "Water", "Coffee"));

        System.out.println("Welcome. Which drink would you like?");
        String selection = input.next(); // String selection = StringUtil.fixFormat(input.next()) ---> we created this method before.

        if(drinks.contains(selection)){
            System.out.println(selection + " is vending");
        } else {
            System.out.println(selection + " is not in the vending machine.");
        }








    }
}
