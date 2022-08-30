package replit;

import java.util.Scanner;

public class MyQuestion12_Replit_ArrayMaxNum_Solved {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        //WRITE YOUR CODE BELOW


        int max = nums[0];

        for (int i = 1; i < nums.length; i++){
            if (max < nums[i]){
                max = nums[i];
            }
        }

        System.out.println(max);















    }
}
