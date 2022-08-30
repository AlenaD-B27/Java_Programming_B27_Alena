package day18_practice;

import java.util.Scanner;

public class SumOfPositives {
    public static void main(String[] args) {
        //    Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

Scanner input = new Scanner(System.in);
        int l = 1;
        int sum = 0;

        while (l >= 1){
            int inNum = input.nextInt();
            l = inNum;
            if(l > 0) {
                sum += l;
            }
        }
        System.out.println(sum);
    }
}
