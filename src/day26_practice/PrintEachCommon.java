package day26_practice;

public class PrintEachCommon {
    public static void main(String[] args) {

//        Write a program that can print out the common elements from each inner element of a 2D
//        array
//
//        Ex:
        int[][] arr = {
            {4, 1, 24, 5},
            {24, 1, 5, 2},
            {4, 1, 5, 1}
        };


        for (int i = 0; i < arr[0].length; i++) { // "i" is an index of each number in the 1st Array line (index of Array line is 0);
            int count = 0; // we need to count if there's 1 appearance in each Array line;

            for (int eachLine = 1; eachLine < arr.length; eachLine++) { // we need to check each Array line in that many Array lines we have except the very first one, that's why I start from 1, not from 0;
                for (int j = 0; j < arr[eachLine].length; j++) { // "j" is an index of each number in next Array line.
                   if(arr[0][i] == arr[eachLine][j]){ // checking if each number in the first Array line equals each number in next Array line;
                       count++; // if the number from the very first Array line found the "twin" in next Array line let's add it to count;
                       break; // if we found the "twin" in the next Array line -> no reason to check other numbers in this Array line => let's go to next Array line (returning to the loop where we eachLine++;
                   }
                }

            }

            if (count == arr.length - 1){ // if we found 1 appearance in each Array line our count should equal the amount of the Array lines, I count "length-1" because I do not need to count the very first Array line.
                System.out.println(arr[0][i]); // after we print the result we need to reset the count at the beginning of the loop (see line 20); the loop will check next number in a very first Array line;
            }
        }









    }
}
