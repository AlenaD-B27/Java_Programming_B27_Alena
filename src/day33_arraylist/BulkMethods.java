package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkMethods {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);

        ArrayList<Integer> other = new ArrayList<>(Arrays.asList(6, 1, 5, 1224));

        nums.addAll(other);
        System.out.println("added from other to nums " + nums);

        nums.addAll(Arrays.asList(9, 2, 6, 35));
        System.out.println("added number using addAll " + nums);

        nums.addAll(0, Arrays.asList(4, 1, 5, 125));
        System.out.println("added to the first index " + nums);

        nums.removeAll(Arrays.asList(1));
        System.out.println("removed all occurrence of 1 " + nums);

        nums.removeAll(Arrays.asList(4, 5, 6));
        System.out.println("removed all 4, 5, 6 " + nums);

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("one", "two", "three", "one", "one", "Two", "One"));
        System.out.println(words);
        words.removeAll(Arrays.asList("one"));
        System.out.println(words);


    }
}
