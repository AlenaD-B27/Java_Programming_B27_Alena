package day32_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringSum {
    /*
    Create a method that will accept an ArrayList of numbers in String format, add each digit of each element and store into a different ArrayList. Return the ArrayList of summed numbers
Ex:
Input:
“123”, “34”, “513”
Output:
[ 6, 7, 9 ]
     */

    public static ArrayList<Integer> stringSum(ArrayList<String> stringsOfNums) {

        ArrayList<Integer> sums = new ArrayList<>();

        for (String each : stringsOfNums) {
            Integer sum = 0;

            for (int i = 0; i < each.length(); i++) {
                sum += Integer.parseInt(each.substring(i,i+1));
            }

            sums.add(sum);


        }
return sums;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> check = new ArrayList<>(Arrays.asList(input.next(),input.next(),input.next()));
        System.out.println(stringSum(check));
    }


}