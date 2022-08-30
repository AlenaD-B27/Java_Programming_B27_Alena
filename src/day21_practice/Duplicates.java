package day21_practice;

import java.util.Scanner;

public class Duplicates {
    /*[IQ] Duplicate characters

    Given a String, find and print the duplicate characters. A character is duplicate if it appears more than once in the String.

    Ex:
    Input:
    AAABCCDEEF
    Output:
    ACE

        -> the characters A C and E are found in the String multiple times so they are duplicates

    variations:
    Write a program that can return the first duplicated character from a string
    Write a program that can return the index number of the first unique character.*/
    public static void main(String[] args) {


       String str = "AAABCCDEEF";

        String newStr = "";
        int count;

        for (int i = 0; i < str.length()-1; i++) {
            count = 0;

            for (int j = i + 1; j < str.length()-1; j++) {

                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if (newStr.contains("" + str.charAt(i))) {
                continue;
            } else if (count > 0){
                newStr += str.charAt(i);
            }


        }
        System.out.println(newStr);










    }
}
