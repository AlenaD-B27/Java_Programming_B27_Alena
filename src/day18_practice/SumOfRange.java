package day18_practice;

public class SumOfRange {
    public static void main(String[] args) {
        //    While Loop Practice
//
//    write a program that will add all the numbers from 1 - 500
        int num = 0;
        int sum = 0;

        while (num < 500) {
            ++num;
            sum += num;
        }


        System.out.println(sum);
    }
}
