package GROUP_PRACTICE;

import java.util.Scanner;

public class ReplitPairs {
    /*
    Given a String [] arr, print a pair of items together in one line until all the pairs are printed. A pair is a element and the element next to it. Print each item with a comma in between them.

Note: The loop used in the given code is to dynamically create the String array. You don't need to fully understand this part yet, focus only on having access to an array.

Main topics: arrays, primitive datatypes, concatenation, index, operators, loops, String

Example:

Input:
  [apple, banana, kiwi, grape, milk, soda, juice, coffee]

Output:
  apple, banana
  banana, kiwi
  kiwi, grape
  grape, milk
  milk, soda
  soda, juice
  juice, coffee
     */
    public static void main(String[] args) {
//DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String[] arr = {"apple", "banana", "kiwi", "grape", "milk", "soda", "juice", "coffee"};
        //                  0      1          2         3       4       5       6
        // length = 8; last index = 7
       //for (int i=0;i<8;i++){
//            arr[i] = input.nextLine();
//        }

        //WRITE YOUR CODE BELOW:

//        System.out.println(arr[0]+ ", " + arr[1]);
//        System.out.println(arr[1]+ ", " + arr[2]);
//        System.out.println(arr[2]+ ", " + arr[3]);
        //                       6              7
        /*
        i < 8    01234567
        i <= 7   01234567

        if i = 0
 */

        for(int i = 0; i < arr.length-1; i++){
            System.out.println(arr[i] + ", " + arr[i+1]);
        }




    }
}
