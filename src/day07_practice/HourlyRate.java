package day07_practice;
import java.util.Scanner;

public class HourlyRate {
    public static void main(String[] args) {
 //       Create a program that will ask the user to enter a salary(double) and number of hours(int). Calculate the hourly rate.
//        hourly rate = salary / (hours weekly * 52)
        System.out.println("Enter salary:");
        Scanner enterNum = new Scanner(System.in);
        double salary = enterNum.nextDouble();
        System.out.println("Enter number of hours:");
        int hours = enterNum.nextInt();
        System.out.println("Hourly rate is:");
        double rate = salary / hours;
        System.out.println(rate);





    }
}
