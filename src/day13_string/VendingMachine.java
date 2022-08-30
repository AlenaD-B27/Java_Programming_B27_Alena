package day13_string;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vending Machine. Select the menu you want to see:\n\tSnacks\n\tDrinks");
        String menu = input.next();

        switch(menu){

            case "Snacks":
                System.out.println("Pick the snack:\n1) Chips 2)Cookies 3)Pretzels 4)Candy");
                int snackOption = input.nextInt();

                if(snackOption == 1){
                    System.out.println("Chips are selected");
                }else if(snackOption == 2){
                    System.out.println("Cookies are my favourite");
                }else if(snackOption == 3){
                    System.out.println("Pretzels dispensing");
                }else if(snackOption == 4){
                    System.out.println("Candy coming right now");
                }else{
                    System.out.println("Not a valid item");
                }

                break;


            case "Drinks":
                System.out.println("Pick the drink number:\n1)Juice 2)Soda");
                int drinkOption = input.nextInt();

                if(drinkOption == 1){
                    System.out.println("Giving Juice");
                }else if(drinkOption == 2){
                    System.out.println("Giving Soda");
                }else{
                    System.out.println("Invalid drink number");
                }


        }
























    }
}
