package my_utils;

import java.util.Arrays;

public class ArrayUtil {
/*
create a method that will accept an int array and return the smallest number from the array
 */

    public static int returnMin (int ... arr){
        int min = arr[0];
        for(int eachNum: arr){
            if (min > eachNum){
                min = eachNum;
            }
        }
        return min;
    }

/*
create a method that will accept an int array and return the biggest number from the array
 */

    public static int returnMax (int ... arr){
        int max = arr[0];
        for(int eachNum: arr){
            if (max < eachNum){
                max = eachNum;
            }
        }
        return max;
    }

/*
create a method that will accept an int array and an int number. Check and return if the given number is in the array.
 */

public static boolean containsNumber (int num, int ... arr){
    int count = 0;
    for(int eachNum: arr){
        if (eachNum == num){
            count++;
        }
    }
    return count > 0;
}
/*
create a method that will accept an int array and an int number. Find and return the index of the number in the array. If there is multiple occurrence return the first occurrence's index
 */

public static int firstIndexOf (int num, int ... arr){
    int index = -1;

    for (int i = 0; i < arr.length; i++) {
        if(arr[i] == num){
          index = i;
          break;
        }
    }
      return index;
    }

/*
overload the indexOf method to work with String array and String element
 */

    public static int firstIndexOf (String word, String ... arr){
        int index = -1;

            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == word){
                    index = i;
                    break;
                }
            }
        return index;
    }
/*
create a method that will accept a String array and a String element. Add the given element value into the end of the array. Do not replace the last index of the given array, but instead create a new array with a bigger size to fit all the original elements plus the new one

 */

    public static String [] addToTheEnd (String str, String ... arr){
        String [] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length-1] = str;
        return newArr;
    }

    /*
    overload the add element method to accept two String arrays. For this one add all the given elements from the second array in the the first array.

     */
    public static String[] addToTheEnd (String[] original, String[] other){

        String[] merged = new String[original.length + other.length];

        for(int i = 0; i < original.length; i++) { // copy the elements from the original array to the new array
            merged[i] = original[i];
        }

        // option: int i = 0, j = original.length; j++ --> merged[j]
        for(int i = 0; i < other.length; i++){ // read the elements from the other array and store them into the merged array
            merged[original.length + i] = other[i];
        }
        return merged;
    }





}
