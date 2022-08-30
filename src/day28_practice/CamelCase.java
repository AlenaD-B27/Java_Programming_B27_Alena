package day28_practice;

import java.util.Scanner;

public class CamelCase {
    /*
    create a method that will accept a String, of words separated by spaces, and return a camel case version of the String where the first letter of each word is Uppercase and the rest of the word is in lowercase.
Exception: First word starts with lowercase

Ex:
	Input:
		JAVA will ruLE tHe wORLd

	Output:
		javaWillRuleTheWorld
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println(returnCamelCase(input.nextLine()));
    }

    public static String returnCamelCase (String inputStr){

        inputStr = inputStr.trim().toLowerCase();

        while (inputStr.contains(" ")){
        int indexSpace = inputStr.indexOf(' ');
        inputStr = inputStr.substring(0,indexSpace)+inputStr.substring(indexSpace+1,indexSpace+2).toUpperCase()+inputStr.substring(indexSpace+2);
        }

        return inputStr;
    }







}
