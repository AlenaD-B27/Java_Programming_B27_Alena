package day20_practice;

import java.util.Scanner;

public class CharactersInString {
    public static void main(String[] args) {
        /*
        Characters in String
    Given a String print the ascii value codes for each character
        Ex:
            Input:
                java
            Output:
                106 97 118 97
         */

        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        for (int i = 0; i < s.length(); i++) {

            int num = s.charAt(i);
            System.out.print(num + " ");


        }













    }
}
