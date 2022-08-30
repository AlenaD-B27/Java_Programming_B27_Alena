package day23_loop_array;

import java.util.Arrays;
import java.util.Scanner;

public class PartyList {
    public static void main(String[] args) {
         /*
    we are throwing a party, we want to gather all the name
     */


            Scanner input = new Scanner(System.in);
            System.out.println("How many people are coming to the party?");
            int size = input.nextInt();

            String[] names = new String[size]; // new String[input.nextInt()];
            System.out.println(Arrays.toString(names)); // showing the empty array created, based on the size from the console

            for(int i = 0; i < names.length; i++){ // purpose: ask for the name, and store to the array
                System.out.println("Enter the name of person " + (i + 1)); // if you don't have parenthesis the line will concatenate left to right, but we want to do addition first i + 1, then concatenate the message
                String guest = input.next();
                names[i] = guest; // names[i] = input.next();
            }
            System.out.println("Final list coming to the party");
            System.out.println(Arrays.toString(names));
    }
}
