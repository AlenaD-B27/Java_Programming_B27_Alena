package day24_practice;

import java.util.Arrays;

public class Anagram {
    /*
    Given two Strings determine if they are anagram or not. Anagram is when the character of the words can be reordered to get a different word
Ex:
  listen
  silent

The letters of the two words are the same so they are anagram
     */
    public static void main(String[] args) {

        String word1 = "listen";
        String word2 = "silent";

        char [] w1 = word1.toCharArray();
        char [] w2 = word2.toCharArray();

        Arrays.sort(w1);
        Arrays.sort(w2);

        System.out.println("Are the words anagrams?");

        System.out.println(Arrays.equals(w1, w2));













    }
}
