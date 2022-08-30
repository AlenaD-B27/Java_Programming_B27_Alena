package day29_practice;
import my_utils.ArrayUtil;

import java.util.Arrays;

public class CallingArrayMethods {
    public static void main(String[] args) {
        System.out.println(ArrayUtil.returnMin(2,3,7,1,-6,0));
        System.out.println(ArrayUtil.returnMax(1,2,3,9,33));
        System.out.println(ArrayUtil.containsNumber(1,0,2,3,4,5));
        System.out.println(ArrayUtil.firstIndexOf(1,2,3,1,1,5,6));
        System.out.println(ArrayUtil.firstIndexOf("java", "IT", "SDET", "CYDEO", "automation", "Soft Skill"));
        System.out.println(Arrays.toString(ArrayUtil.addToTheEnd("java", "hello", "world", "I", "am", "learning")));















    }
}
