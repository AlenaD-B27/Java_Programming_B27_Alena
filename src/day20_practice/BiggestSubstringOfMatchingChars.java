package day20_practice;

import java.util.Scanner;

public class BiggestSubstringOfMatchingChars {
    public static void main(String[] args) {

        /*
        Biggest substring of matching characters

Given a String find the biggest substring of chars that match and print it.
    Ex:
        Input:
            aaabbbcccccddddee
        Output:
            ccccc

         */
        String str = "aaabbbcccccddddeeeeee";
        String longest = ""; // ccccc
        String each = ""; // eeeeee

        for(int i = 0; i < str.length() - 1; i++){

            each += str.charAt(i); // adds the characters at index i so the String each

            // checks for the end of the String
            if(i == str.length() - 2 && str.charAt(i) == str.charAt(i + 1)){
                each += str.charAt(i + 1);
                if(each.length() > longest.length()){
                    longest = each;
                }
            }

            if(str.charAt(i) != str.charAt(i + 1)) { // if the current character is not equal to the next character

                if(each.length() > longest.length()){
                    longest = each;   // if you find a longer substring, assign it to the longest variable
                }

                each = ""; // resetting for the next part/letter
            }

        }

        System.out.println(longest);






    }
}
