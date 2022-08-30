package day23_loop_array;

import java.util.Arrays;
import java.util.Scanner;

public class CreatingArrays {
    public static void main(String[] args) {
         /*
            Student Information
            0 -> id
            1 -> first name
            2 -> last name
            3 -> batch num
         */

        // Have all the information:
        String[] studentOne = {"04", "Kristina", "Gaidamovic", "27"};
        System.out.println(Arrays.toString(studentOne));

        // Know the number of elements, but not the values yet
        String[] studentTwo = new String[4];
        studentTwo[0] = "10";
        studentTwo[1] = "Olena";
        studentTwo[2] = "Kravetska";
        studentTwo[3] = "27";
        System.out.println(Arrays.toString(studentTwo));

        // know the number of elements, and add from Scanner
        Scanner input = new Scanner(System.in);
        String[] studentThree = new String[4];
        System.out.println("Enter your id");
        studentThree[0] = input.next();
        System.out.println("Enter your first name");
        studentThree[1] = input.next();
        System.out.println("Enter your last name");
        studentThree[2] = input.next();
        System.out.println("Enter your batch number");
        studentThree[3] = input.next();
        System.out.println(Arrays.toString(studentThree));

        // most dynamic:
        String[] studentFour = new String[4];
        String[] questions = {"id", "first name", "last name", "batch number"};
        for(int i = 0; i < studentFour.length; i++){
            System.out.println("Enter your " + questions[i]); // print a dynamic message based on the questions defined in the question elements
            studentFour[i] = input.next(); // storing the scanner input from the console into the array at index i
        }
        System.out.println(Arrays.toString(studentFour));

    }
}
