package day20_practice;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {

        /*
         Given a sentence determine how many words are in the String.
        Ex:
            Input:
                This has multiple words
            Output:
                4
         */

        Scanner input = new Scanner(System.in);
        String s = input.nextLine().trim();
        int hasSpace = 0;


        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' '){
                hasSpace++;
            }

        }

        System.out.println(hasSpace + 1 + " words");



    }
}
