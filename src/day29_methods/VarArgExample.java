package day29_methods;

public class VarArgExample {
    public static void main(String[] args) {
        int[] a = {3,1,3,5};
        printAll(a);
        System.out.println();
        dynamic(4,1,6,2);
    }

    public static void printAll(int [] nums){
        for (int each: nums) {
            System.out.println(each + " ");
        }
    }
    public static void dynamic(int ... nums){
        for (int each: nums) {
            System.out.println(each + " ");
        }
    }

}
