package day19_practice;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        /*
Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase

Ex:
	Today is SUNDAY

	Output:
	todayIsSunday
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter multiple words:");
        String str = input.nextLine().toLowerCase();
        String camelCase = "";

        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == ' '){

                camelCase += str.substring(i+1, i+2).toUpperCase();
               // str.charAt(i + 1)

                i++;

            } else {
                camelCase += str.charAt(i);
            }


        }
        System.out.println(camelCase);



















    }
}
