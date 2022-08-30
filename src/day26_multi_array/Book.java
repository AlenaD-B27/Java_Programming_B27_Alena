package day26_multi_array;

import java.util.Arrays;
import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many chapters do you want to write?");
        int chapters = input.nextInt();
        input.nextLine(); // handle enter input

        String[][] book = new String[chapters][];

        for(int i = 0; i < chapters; i++){
            System.out.println("Type your chapter");
            book[i] = input.nextLine().trim().split(" "); // reading a String from the console then trimming the extra spaces in the beginning and end and finally splitting the array by the spaces, getting a String array with each word as a separate element. That String array is stored into the book 2D array
        }

        System.out.println(Arrays.deepToString(book));

        // print each inner array, one a time

        for(int i = 0; i < book.length; i++){
            System.out.println(Arrays.toString(book[i]));
        }

        // print each word from the array, one a time

        for(int i = 0; i < book.length; i++){
            for(int j = 0; j < book[i].length; j++) {
                System.out.println(book[i][j]);
            }
        }
    }
}
