package day28_practice;

public class ArrayContainsNumber {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        System.out.println(ifContains(nums, 8));
    }
    public static boolean ifContains (int [] nums, int num){
       boolean ifContains = false;
        for(int eachNum: nums){
            if (eachNum == num){
                ifContains = true;
            }

        }
        return ifContains;
    }
}
