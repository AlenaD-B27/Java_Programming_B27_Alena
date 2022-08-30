package day33_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicates {
    /*
    Create a method that will take an ArrayList of numbers and remove any duplicates values.
The method will return an ArrayList of unique elements.

@param nums - The given ArrayList of numbers
@return - ArrayList of numbers


Ex:
Input: {1, 3, 5, 1, 4, 5, 9};
Output: {3, 4, 9};
     */
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9));
        System.out.println(removeDuplicates(nums));
        System.out.println(removeDuplicates2(nums));
    }
// the best approach from my groupmates:

    public static ArrayList<Integer> removeDuplicates (ArrayList<Integer> list){
        list.removeIf(p -> Collections.frequency(list, p) > 1);
        return list;
    }
    // let's try something "made by Alena" lol:

    public static ArrayList<Integer> removeDuplicates2(ArrayList<Integer> list) {

        ArrayList<Integer> noDuplicates = new ArrayList<>();

        for (int j = 0; j < list.size(); j++) {
            int count = 0;
            for (Integer each : list) {
                if (each == list.get(j)) {
                    count++;
                }
            }


            if (count <= 1) {
                noDuplicates.add(list.get(j));
            }


        }
        return noDuplicates;
    }
}