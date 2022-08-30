package day19_practice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

       /*
       [IQ] Prime number

Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.

Ex:
	Input:
		11

	Output:
		prime


Ex:
	Input:
		10

	Output:
		not prime
        */
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();


        int f = 0; // amount of "falses"


        for ( int i = 2; i < num ; i++) {       // i is just the number we will divide for, if once reminder
            if (num % i != 0){                   // is equal to 0 means the number is not prime.
            } else {                               // and this is the moment when we add +1 false to our f.
                f++;
            }
        }


        if (f > 0){
            System.out.println("not prime");   // is we have at least 1 false the number is not prime.
        } else {
            System.out.println("prime");
        }

        System.out.println("======== Saim's solution: ================");

        int n = input.nextInt();
        boolean isPrime = true;

        for(int j = 2; j < n/2; j++){

            if(n % j == 0){
                isPrime = false;
            }
        }
        System.out.println(isPrime ? "Prime" : "Not Prime");











    }
}
