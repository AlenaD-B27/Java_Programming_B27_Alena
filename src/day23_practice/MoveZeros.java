package day23_practice;

import java.util.Arrays;

public class MoveZeros {
    /*
    Move Zeros

	Write a program that will move all the zero numbers to the end of the array. The rest of the numbers will move over in position

Hint: You don’t have to manipulate the given array, try to use another array too. Think about the indexes

	Ex:
	Input:
		[10, 0, 5, 0, 1, 0]
	Output:
		[10, 5, 1, 0, 0, 0]
     */
    public static void main(String[] args) {

       int [] nums = {10, 0, 5, 0, 1, 0};
       int [] arr = new int [nums.length];
       int index = 0;

        for (int i = 0; i < nums.length; i++) {
           if(nums[i] != 0){
               arr[index] = nums[i];     // or arr[index++] = nums[i];
               index++;
           }
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("=============================================");
        // if I want to do the same with ones, not zeroes:

        int [] numbers = {10, 0, 5, 1, 1, 0};
        int [] arr1 = new int [numbers.length];
        int indx = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 1;
        }

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] != 1){
                arr1[indx++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(arr1));




    }
}
