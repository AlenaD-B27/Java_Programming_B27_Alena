package day34_practice.rectangle;

import java.util.Scanner;

public class RectangleUse {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        Scanner input = new Scanner(System.in);

        r.base = input.nextDouble();
        r.height = input.nextDouble();
        r.calculatePerimeter();
        r.calculateArea();
        System.out.println((r));


    }
}
