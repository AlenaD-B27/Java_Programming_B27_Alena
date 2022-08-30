package day18_practice;

import java.util.Scanner;

public class PaintColors {
    public static void main(String[] args) {
        //    write a program that will allow the user to select three colors for the painting. There needs to be 3 unique colors selected
//
        Scanner input = new Scanner(System.in);
        System.out.println("Choose 3 colors: 1) White 2) Black 3) Red 4) Yellow 5) Green 6) Blue 7) Pink");
        int attempts = 0;

        while (attempts < 3) {
            attempts++;
            int color = input.nextInt();

            switch (color) {
                case 1:
                    System.out.println("White");
                    break;
                case 2:
                    System.out.println("Black");
                    break;
                case 3:
                    System.out.println("Red");
                    break;
                case 4:
                    System.out.println("Yellow");
                    break;
                case 5:
                    System.out.println("Green");
                    break;
                case 6:
                    System.out.println("Blue");
                    break;
                case 7:
                    System.out.println("Pink");
                    break;
                default:
                    System.out.println("Invalid data");
            }


        }



    }
}
