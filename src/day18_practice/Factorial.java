package day18_practice;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        //    write a program that calculates the factorial of a number:
//    ex: 5! = 5 * 4 * 3 * 2 * 1 = 120
Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int factorial = a;
        while (a > 1){
            a--;
            factorial *= a;
        }
        System.out.println(factorial);
    }
}
