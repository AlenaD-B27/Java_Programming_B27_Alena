package day20_loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String list = "";

        while(true){

            System.out.println("Enter an item");
            list += "\n* " +input.nextLine();

            System.out.println("Do you want to add another item");
            if(input.nextLine().equalsIgnoreCase("no")){
                break;
            }

        }

        System.out.println(list);











    }
}
