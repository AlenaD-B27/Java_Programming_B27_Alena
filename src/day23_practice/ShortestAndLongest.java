package day23_practice;

import java.util.Scanner;

public class ShortestAndLongest {
    /*
    Shortest and Longest words from String array

	• Write a program that can return the shortest string element from a String array
	• Write a program that can return the longest string element from a String array

Hint: a good default value is the first element
     */
    public static void main(String[] args) {

        String [] arr = {"aa", "bbb", "ccccc", "d"};
        String longest = arr[0];
        String shortest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(longest.length() < arr[i].length()){
                longest = arr[i];
            }
            if(shortest.length() > arr[i].length()){
                shortest = arr[i];
            }
        }

        System.out.println("the longest line is " + longest);
        System.out.println("the shortest line is " + shortest);





    }
}
