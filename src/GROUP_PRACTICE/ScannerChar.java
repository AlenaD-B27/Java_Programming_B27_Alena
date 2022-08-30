package GROUP_PRACTICE;

import java.util.Scanner;

public class ScannerChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Integer : ");
        int value1 = input.nextInt();


        System.out.println("Double  : ");
        double value2 = input.nextDouble();

        System.out.println("Char : ");
        char value3 = input.next().charAt(0);


        System.out.println( "Integer :" + value1);
        System.out.println( "Double :" + value2);
        System.out.println( "Char :" + value3);




    }
}
