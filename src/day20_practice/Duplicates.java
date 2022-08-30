package day20_practice;

import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
       /*
       Remove Duplicates
    Write a program that can remove duplicates from a String
        Ex:
            Input: abcabc
            Output: abc
        */

        Scanner input = new Scanner(System.in);
        String s = input.next().trim().toLowerCase();
        String s1 = s.substring(0,1);


        for (int i = 1; i < s.length(); i++) {
            if (s1.contains(s.substring(i, i+1))){
                i++;
            } else {
                s1 += s.substring(i, i+1);
            }
        }
        System.out.println(s1);





    }
}
