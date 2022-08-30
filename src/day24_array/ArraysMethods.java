package day24_array;

import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {
        int [] nums = {32, 5, -9, 3, 1, 20};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums)); // sorts from min to max

        String [] strs = {"Hello", "world", "4four","abs", "#Zebra", "apple", "1aaaaa"};
        System.out.println(Arrays.toString(strs));
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs)); // spec. chars, numbers; Upper, lower ---> alphabetical

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {1, 2, 4};
        int[] d = {3, 2, 1};

        System.out.println(Arrays.equals(a, b));
        System.out.println(Arrays.equals(b, c));
        System.out.println(Arrays.equals(a, d));

        Arrays.sort(d);
        System.out.println(Arrays.equals(a, d));


    }
}
