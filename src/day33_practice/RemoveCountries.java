package day33_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveCountries {
    /*
    Create a method that will take an ArrayList of countries and returns an ArrayList of countries that have a length of less than 7

@param nums - The given ArrayList of numbers
@return - ArrayList of numbers

Ex:
Input: "Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"
Output: "Japan", "Korea", "Turkey", "Canada"
     */
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>(Arrays.asList("Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"));
        System.out.println(shorterThan7(countries));
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 5, 13, 6, 14, 6));
        System.out.println(smallerThan7(numbers));
    }


    public static ArrayList<String> shorterThan7 (ArrayList<String> listOfStrings){
        listOfStrings.removeIf(p -> p.length() >= 7);
        return listOfStrings;
    }

    public static ArrayList<Integer> smallerThan7 (ArrayList<Integer> listOfIntegers){
        listOfIntegers.removeIf(p -> p >= 7);
        return listOfIntegers;
    }






}
