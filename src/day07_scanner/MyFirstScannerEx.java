package day07_scanner; // 1.

import java.util.Scanner; // 1.

public class MyFirstScannerEx {  // 1.
    public static void main(String[] args) { // 1.

     Scanner input = new Scanner(System.in);   // 2.
        System.out.println("Please, enter a number");
       int number = input.nextInt(); // 3.
        System.out.println("THIS IS YOUR NUMBER: " + number); // DON'T LEAVE YOUR COMPUTER HERE, THE PROGRAM IS RUNNING!!! OR YOU STOP THE PROGRAM OR FINISH!!!
// you enter the number in the CONSOLE. ===> hit Enter
    }
}
// 1. package ==> import java.util.Scanner; ==> class ==> main method
// 2. make Scanner variable/object Scanner name = new Scanner(System.in); ---- common names for the object: scan, scanner, input, keyboard, in.
// 3. use/run methods from the object:
//nextByte()
// nextShort()
// nextInt()  *
// nextLong()
// nextFloat()
// nextDouble()  *
// nextBoolean()
// next()
// nextLine()  *

