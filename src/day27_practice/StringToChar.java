package day27_practice;

import java.util.Scanner;

public class StringToChar {
    /*
    create a method that accepts a String and print each character of the String on a separate line
     */

    public static void PrintStringAsChars(String string){
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            System.out.println(ch);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text:");
        PrintStringAsChars(input.nextLine());
    }















}
