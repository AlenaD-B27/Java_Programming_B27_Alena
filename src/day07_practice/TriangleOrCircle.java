package day07_practice;
import java.util.Scanner;
public class TriangleOrCircle {
    public static void main(String[] args) {
//        Create a program that will ask the user to enter 3 angle numbers ( can be floating numbers )
//        Determine if the angles make a triangle, which means the angles add to 180.0
//        and
//        Determine if the angles make a circle, which means the angles add to 360.0
        System.out.println("Enter angle 1:");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        System.out.println("a = " + a);
        double b = input.nextDouble();
        System.out.println("b = " + b);
        double c = input.nextDouble();
        System.out.println("c = " + c);

        boolean isTriangle = a+b+c == 180;
        boolean isCircle = a+b+c == 360;
        System.out.println("isTriangle = " + isTriangle);
        System.out.println("isCircle = " + isCircle);



    }
}
