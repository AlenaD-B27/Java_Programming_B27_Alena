package day18_loops;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {

        /*

            ask the user to type 5 numbers
            find the biggest number

            4
            142
            230
            32
            5
         */

        Scanner input = new Scanner(System.in);
        int max = -2147483648;
        int min = 2147483647;
        int num = 0; // to keep track of the iterations

        while(num++ < 5){ // this loop will run for 5 times | start from 1 and go until <= 5
            System.out.println("Enter a number");
            int inputNum  = input.nextInt();

            if(inputNum > max){
                max = inputNum;  // if the new number from the console is bigger than our current biggest number, we found a new max number and should reassign it to the variable
            }

            if(inputNum < min){
                min = inputNum;
            }

        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        /*

            Execution:
                int max = -2147483648;
                int min = 2147483647;
                int num = 0;
            What a number:
                  > 50
                if(inputNum > max)   50 > -2147483648 -> true
                true means: max = inputNum --> max becomes 50

                if(inputNum < min){ 50 < 2147483647 -> true
                true means min = inputNum --> min becomes 50

            iteration 2:
                int max = 50
                int min = 50
                int num = 1;

                while(num++ < 5){ 1 < 5 -> true ---> num = 2
                Enter a number
                    > 100
                if(inputNum > max) 100 > 50 --> true
                true means: max: inputNum --> max becomes 100

                if(inputNum < min){ 100 < 50 -> false

            iteration 3:
                int max = 100
                int min = 50
                int num = 2;

                while(num++ < 5){ 2 < 5 -> true ---> num = 3
                Enter a number
                    > 10
                if(inputNum > max) 10 > 100 --> false

                if(inputNum < min){ 10 < 50 -> true
                true means: min = inputNum --> min becomes 10

            iteration 4:
                int max = 100
                int min = 10
                int num = 3;

                while(num++ < 5){ 3 < 5 -> true ---> num = 4
                Enter a number
                    > 40
                if(inputNum > max) 40 > 100 --> false

                if(inputNum < min){ 40 < 10 -> false

         */















    }
}
