package day28_practice;

import java.util.Scanner;

public class MinAndMaxInArray {
    public static void main(String[] args) {
        int [] nums = new int [5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }

        System.out.println("min is " + returnMin(nums));
        System.out.println("max is " + returnMax(nums));
    }
    public static int returnMin (int [] nums){
        int min = nums[0];
        for (int eachNum : nums){
            if(min > eachNum){
                min = eachNum;
            }
        }
        return min;
    }

    public static int returnMax (int [] nums){
        int max = nums[0];
        for (int eachNum : nums){
            if(max < eachNum){
                max = eachNum;
            }
        }
        return max;
    }

}
