package day13_string;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        System.out.println("1) Select the primitive datatype");
        System.out.println("a) String");
        System.out.println("b) int");
        System.out.println("c) main");

        Scanner input = new Scanner(System.in);

        char option = input.next().charAt(0);

        switch(option){
            case 'b':
                System.out.println("Correct");
                break;
            case 'a':
            case 'c':
                System.out.println("Incorrect");
        }





    }
}
