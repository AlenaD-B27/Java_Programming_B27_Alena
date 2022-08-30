package day28_practice;

import java.util.Arrays;

public class AddElementToArray {
    /*
    create a method that will accept an int array and an int number. Return an array with the given number added to the end of the array
     */
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(addElement(arr,6)));
    }
    public static int [] addElement (int [] array, int number){
        int [] newArr = Arrays.copyOf(array, array.length+1);
        newArr[newArr.length - 1] = number;
        return newArr;
    }










}
