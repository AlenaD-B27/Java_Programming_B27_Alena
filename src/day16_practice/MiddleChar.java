package day16_practice;

import java.util.Scanner;

public class MiddleChar {
    public static void main(String[] args) {

//        [Middle char]
//
//        Given a String, write a program to display the middle character of a string
//        a) If the length of the string is even there will be two middle characters.
//        b) If the length of the string is odd there will be one middle character.
        Scanner input = new Scanner(System.in);
        System.out.println("enter word");
        String word = input.next();
        boolean isEven = word.length()%2 == 0;
        char midChar;
        char midChar1;
        char midChar2;
        if (isEven == false){
            midChar = word.charAt(word.length()/2);
            System.out.println(midChar);
        }else{
            midChar1 = word.charAt(word.length()/2-1);
            System.out.print(midChar1);
            midChar2 = word.charAt(word.length()/2);
            System.out.print(midChar2);
        }




//
//        Input:
//        elephant
//        Output:
//        The middle characters: ph









    }
}
