package day21_nested_loop;

import java.util.Scanner;

public class PrimeRange {
    /*
       Prime: number is only divisible by 1 and itself

       print all the prime number up to a certain number

       50

       print all the prime numbers from 2 - 50
       2 3 5 7 11 .... 47

    */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What number do you want to go to?");
        int range = input.nextInt();

        // outer loops checks all the numbers from 2 - range
        for (int i = 2; i <= range; i++) { // starting from 2 and going until the range number

            boolean isPrime = true; // every time the outer loop runs the boolean variable has a value of true, it means for every number in the range, we start from true

            // inner loop checks if the number is prime
            for (int j = 2; j < i; j++) { // starting from 2 because I want to check divisibility of the number from 2 to the number itself

                if (i % j == 0) { // the number we are checking (i) is evenly divisible by the j values (from 2 to the number) it means its not prime
                    isPrime = false;
                    break; // break stops the inner loop
                }

            } // end of the inner loop

            if (isPrime) {
                System.out.println(i);
            }

        } // end of the outer loop

    }
}