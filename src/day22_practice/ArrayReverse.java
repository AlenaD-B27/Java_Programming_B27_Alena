package day22_practice;

public class ArrayReverse {
    public static void main(String[] args) {
        /*
        Create an array of 5 numbers. Manually reverse the array
No loop yet

---------------------------------------------------------------------------
         */
        String str = "12345";
        int[] nums = {1, 2, 3, 4, 5};

        System.out.print(nums.length + " ");
        System.out.print(nums.length-1 + " ");
        System.out.print(nums.length-2 + " ");
        System.out.print(nums.length-3 + " ");
        System.out.println(nums.length-4 + " ");

        System.out.println("======================================");

        System.out.print(nums[4] + " ");
        System.out.print(nums[3] + " ");
        System.out.print(nums[2] + " ");
        System.out.print(nums[1] + " ");
        System.out.println(nums[0] + " ");

        System.out.println("======================================");
//             int[] nums = {1, 2, 3, 4, 5};
        //          index:   0  1  2  3  4
        for (int i = nums.length - 1; i >= 0 ; i--) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println("======================================");









    }
}
