package day23_practice;

import java.util.Arrays;

public class ReverseArray {
    /*
    Reverse Array

	Write a program that will reverse the order of any given array
		Ex:
		Input:
			[1, 2, 3, 4, 5]
		Output:
			[5, 4, 3, 2, 1]

     */
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
        int [] reverse = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reverse[i] = arr[arr.length - 1 - i];
        }

        System.out.println(Arrays.toString(reverse));










    }
}
