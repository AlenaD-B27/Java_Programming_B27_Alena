package day23_loop_array;

import java.util.Arrays;

public class EvenOrOdd {
    public static void main(String[] args) {
        int[] nums = {3, 5, 12, 12, 5, 12, 4, 2};
        System.out.println(Arrays.toString(nums));
        int even = 0, odd = 0;

        for(int each: nums){
            if(each % 2 == 0){
                even++; // print(each + " is even")
            } else {
                odd++; // print(each + " is odd")
            }
        }

//        for(int i = 0; i < nums.length; i++){
//            if(nums[i] % 2 == 0){
//                even++; // print(each + " is even")
//            } else {
//                odd++; // print(each + " is odd")
//            }
//        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
