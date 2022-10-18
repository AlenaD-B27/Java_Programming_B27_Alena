package day15_practice;

import java.util.Scanner;

public class LongesWithA {
    public static void main(String[] args) {

       /*
       create a class LongestWithA
ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

	Ex:
		"java"
		"mouse"
		"computer"

	Output: java

Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 lines:");
        String line1 = input.nextLine();
        String line2 = input.nextLine();
        String line3 = input.nextLine();


        boolean is1bigger = line1.length() > line2.length() && line1.length() > line3.length();
        boolean is2bigger = line2.length() > line1.length() && line2.length() > line3.length();
        boolean is3bigger = line3.length() > line1.length() && line3.length() > line2.length();
        boolean is1n2bigger = line1.length() == line2.length() && line1.length() > line3.length();
        boolean is2n3bigger = line2.length() > line1.length() && line2.length() == line3.length();
        boolean is3n1bigger = line3.length() == line1.length() && line3.length() > line2.length();
        boolean is1n2n3bigger = line3.length() == line1.length() && line3.length() == line2.length();

        line1.toLowerCase();
        line2.toLowerCase();
        line2.toLowerCase();
        line3.toLowerCase();

        System.out.println("Enter Char: ");
        String hasChar = input.next().toLowerCase();

        boolean is1hasChar = line1.contains(hasChar);
        boolean is2hasChar = line2.contains(hasChar);
        boolean is3hasChar = line3.contains(hasChar);




        System.out.println("The longest line/lines which contain/s " + hasChar + " is/are ");

        if(is1hasChar && is2hasChar || is1hasChar && is3hasChar || is1hasChar || is1hasChar&&is2hasChar&&is3hasChar){
            if(is1bigger || is1n2bigger || is3n1bigger || is1n2n3bigger){
            System.out.println(line1);
            }
        }

        if(is2hasChar && is1hasChar || is2hasChar && is3hasChar || is2hasChar || is1hasChar&&is2hasChar&&is3hasChar){
            if(is2bigger || is1n2bigger || is2n3bigger || is1n2n3bigger){
                System.out.println(line2);
            }
        }

        if(is3hasChar && is1hasChar || is3hasChar && is2hasChar || is3hasChar || is1hasChar&&is2hasChar&&is3hasChar){
            if(is3bigger || is3n1bigger || is2n3bigger || is1n2n3bigger){
                System.out.println(line3);
            }
        }




        }


      


















    }

