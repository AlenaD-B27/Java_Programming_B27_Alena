package day28_practice;

import java.util.Scanner;

public class FixFormat {
    /*
    create a method will accept a String and return a String in proper format. Proper format is:
First character starting as uppercase and the rest as lowercase

Ex:
	Input:
		jamES

	Output:
		James
     */

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println(toProperFormat(input.next()));
    }







    public static String toProperFormat (String inputStr){

        String str = inputStr.substring(0,1) + inputStr.substring(1).toLowerCase().trim();
        return str;

    }








}
