package day24_practice;

public class SecondBiggestNumber {
    public static void main(String[] args) {
        /*
        Given an Array of numbers. Find and print the 2nd biggest number.

Note the 2nd biggest should be unique meaning it should be different from the max number

Example:
	Input:
		[4,3,1,4,5,2,4,8,4,8]
	Output:
		5
         */

int nums [] = {4,3,1,4,5,2,4,8,4,8};
int countMax = 0;
int max = nums[0];


        for (int i = 1; i < nums.length; i++) {
            if(max < nums[i]){
                max = nums[i];
            }
        }
        // found what number is the biggest;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == max){
                countMax++;
            }
        }
        // found the amount of the biggest number in original Array (nums);

        int [] leftover = new int [nums.length - countMax];
        int indexLeftover = 0;

        for (int eachNum: nums) {
            if (eachNum != max){
                leftover[indexLeftover] = eachNum;
                indexLeftover++;
            }
        }

        // new Array doesn't have the biggest number anymore, so now we can find the biggest number of leftover;

        int secondMax = leftover[0];
        for (int eachNum: leftover) {
            if(eachNum > secondMax){
                secondMax = eachNum;
            }
        }

        System.out.println(secondMax);












    }
}
