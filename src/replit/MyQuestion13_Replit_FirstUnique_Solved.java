package replit;

import java.util.Scanner;

public class MyQuestion13_Replit_FirstUnique_Solved {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //WRITE YOUR CODE BELOW:

        int[] nums = {1,1,2,2,3,2,10};


        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j] && i != j){
                    count++;
                    break;
                }
            }
            if(count == 0){
            System.out.println(nums[i]);
            break;
            }
        }













    }
}
