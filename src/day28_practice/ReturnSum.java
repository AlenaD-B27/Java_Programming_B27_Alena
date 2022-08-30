package day28_practice;


import java.util.*;

public class ReturnSum {
    /*
    Create a method that accept an int array. Take the sum of all the numbers and return the sum
     */

    public static int sum (int nums []){
        int sum = 0;
        for (int eachNum: nums) {
            sum += eachNum;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("How many numbers do you want to summarise?");
        int [] nums = new int[input.nextInt()];
        System.out.println("Enter numbers:");
        for (int i = 0; i < nums.length; i++) {
           nums[i] = input.nextInt();
        }
        System.out.println("Sum = " + sum(nums));

    }




}
