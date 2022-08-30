package day26_practice;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
//        Given a 2D int array merge the elements into one 1D array
//
//        Ex:
    int [][] nums = {
                {10, 20, 30},
                {5, 10, 15}
        };
//        Output:
//              [ 10, 20, 30, 5, 10, 15 ]

        int newArrLength = 0;
        for(int eachArr [] : nums){
            for( int eachNum : eachArr){
                newArrLength++;
            }
        }


        int nums1D [] = new int [newArrLength];
        int index = 0;

        for(int eachLine [] : nums){
                for (int eachNum : eachLine) {
                   nums1D[index] = eachNum;
                   index++;
                }
        }


        System.out.println(Arrays.toString(nums1D));





    }
}
