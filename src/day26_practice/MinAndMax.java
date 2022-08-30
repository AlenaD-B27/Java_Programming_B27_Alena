package day26_practice;

import java.util.Arrays;

public class MinAndMax {
    public static void main(String[] args) {

      /*
      Given a 2D int array find the max and min number from the whole array

       int[][] {
              {1, 5, 2, 23},
              {-12, 41, -5, -2},
              {1, 5, 1, 5}
       }

       Max: 41
       Min -12

Extra: Find the max and min between each inner array

       */

        int[][] arr2D = {
            {1, 5, 2, 23},
            {-12, 41, -5, -2},
            {1, 5, 1, 5}
        };

        int max = arr2D [0][0];
        int min = arr2D [0][0];

        for( int [] eachArr : arr2D){
            for ( int eachNum : eachArr) {

                if(max < eachNum){
                    max = eachNum;
                }
                if(min > eachNum){
                    min = eachNum;
                }


            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("=========================================");
        System.out.println("Extra:");
        System.out.println();

        //        int[][] arr2D = {
        //            {1, 5, 2, 23},
        //            {-12, 41, -5, -2},
        //            {1, 5, 1, 5}
        //        };



        for (int i = 0; i < arr2D.length; i++) {
            min = arr2D[i][0];
            max = arr2D[i][0];

           for(int eachNum : arr2D [i]){

               if(min > eachNum){
                   min = eachNum;
               }
               if(max < eachNum){
                   max = eachNum;
               }

            }
            System.out.println("Array with index " + i + ": " + Arrays.toString(arr2D[i]));
            System.out.println("Min in Array " + i + ": " + min);
            System.out.println("Max in Array " + i + ": " + max);

        }














    }
}
