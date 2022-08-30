package day07_practice;
import javax.lang.model.SourceVersion;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Revenue {
    public static void main(String[] args) {
//        Create a program that will ask the user to enter a price and quantity and then calculate the revenue. revenue = price × quantity.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter price: ");
        double price = input.nextDouble();
        System.out.println("Enter quantity: ");
        int q = input.nextInt();
        double revenue = price * q;
        System.out.println("revenue = " + revenue);

    }
}
