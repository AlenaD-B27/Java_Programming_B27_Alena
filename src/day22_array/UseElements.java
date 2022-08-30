package day22_array;

import java.util.Arrays;

public class UseElements {
    public static void main(String[] args) {

        int [] nums = {4, 5, 12};
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));

        System.out.println(nums[0] + nums[1]); // int + int

        String [] strs = {"Hello", "World", "java", "code"};
        System.out.println(strs.length); // how many elements in array
        System.out.println(strs[2]);
        System.out.println(strs[2] + strs[3]); // String + String
        System.out.println(strs[0].length()); // String method length() --> tell the number of character in the String
        System.out.println(strs[1].charAt(strs[1].length() -1)); // last index of the element at index 1

        String s = strs[3]; // assigning the value of the 3rd index of the array in to a new String variable s












    }
}
