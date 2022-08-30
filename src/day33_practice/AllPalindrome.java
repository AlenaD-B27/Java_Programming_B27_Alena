package day33_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPalindrome {
    /*
    Create a method that will accept an ArrayList of Strings and return an ArrayList of Palindrome Strings
Ignore case sensitivity

Ex:
Input:
     "Anna",  "Java",  "Python", "Racecar", "Level", "Cydeo”, "Eye"
Output:
    Anna, Racecar, Level, Eye
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Anna",  "Java",  "Python", "Racecar", "Level", "Cydeo", "Eye"));
        System.out.println(allPalindrome(list));
    }



    public static ArrayList<String> allPalindrome (ArrayList<String> arrList){

       ArrayList<String> listOfReversed = new ArrayList<>();

        for (String each : arrList){
            String reverse = "";
            for (int i = each.length()-1; i >= 0; i--) {
                reverse += each.charAt(i);
            }
            listOfReversed.add(reverse);
        }

        ArrayList<String> leftovers = new ArrayList<>(arrList);

        for (String eachWord: listOfReversed){
            leftovers.removeIf(eachReverse -> eachWord.equalsIgnoreCase(eachReverse));
        }

        arrList.removeAll(leftovers);

        return arrList;
    }
}
