package day16_practice;

import java.util.Scanner;

public class RemoveFirstAndLast {
    public static void main(String[] args) {
        /*
        Given two words. Print the first word without its first character then print the second word without its last character.

    Input:
        apple
        banana
    Output:
        pple
        banan
         */


        String word1 = new String("apple").substring(1);
        System.out.println(word1);
        String word2 = new String("banana");
        int q = word2.length();
        System.out.println(word2.substring(0,q-1));









    }
}
