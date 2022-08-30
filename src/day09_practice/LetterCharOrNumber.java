package day09_practice;

import java.util.Scanner;

public class LetterCharOrNumber {
    public static void main(String[] args) {

//        create a char variable letter. Find and print if the character is a letter, number, or special character
//
//        ex: p
//                letter
//
//        ex:
//        6
//        number
//
//        ex:
//        $
//        speical character
//        ________________________________________________________________________
Scanner input = new Scanner(System.in);
char x = input.next().charAt(0);

if((x >= 'A' && x <= 'Z')||(x >= 'a' && x <= 'z')) {
    System.out.println("letter");
        }else if(x >= '0' && x <= '9'){
    System.out.println("number");
        }else{
    System.out.println("special character");
        }
















    }
}
