package day09_if_statements;

import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is divisible by 2");
        }

        if (n % 3 == 0) {
            System.out.println(n + " is divisible by 3");
        }

        if (n % 5 == 0) {
            System.out.println(n + " is divisible by 5");
        }
    }
}
