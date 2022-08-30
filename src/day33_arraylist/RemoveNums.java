package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveNums {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 5, 2, 3, 5, 2, 1, 5, 1, 8, 9, 7, 4, 10, 0, 2, 3));

        // remove all the numbers that are less than 5

        for (int i = 0; i < nums.size(); i++) {
           if(nums.get(i) < 5){
               nums.remove(i);
               i--; // when I remove an element, the elements will move over AND the indexes will change, so if I do not do i-- it will skip the element at the next index.
           }
        }

        System.out.println(nums);
        System.out.println("=====================================================================");

        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(1, 5, 2, 3, 5, 2, 1, 5, 1, 8, 9, 7, 4, 10, 0, 2, 3));

        // remove all nums that are less than 5 using removeIf

        nums2.removeIf(   n ->  n < 5  ); //n will be every element

        System.out.println(nums2);





    }
}
