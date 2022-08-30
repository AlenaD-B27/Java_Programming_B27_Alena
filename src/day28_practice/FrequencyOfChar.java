package day28_practice;

import java.util.Scanner;

public class FrequencyOfChar {
    /*
    create a method that will accept a word(String) and a letter (char) and return how many times that given letter is found in the given word

     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println(frequencyOfChar(input.next().toLowerCase(), toLowerCaseChar(input.next().charAt(0))));

    }
    public static int frequencyOfChar (String str, char x){
        int frequency = 0;
        for (int i = 0; i < str.length(); i++) {
           if (str.charAt(i) == x){
               frequency++;
           }
        }
        return frequency;
    }
    public static char toLowerCaseChar (char x){
        String x1 = ""+x;
        x = x1.charAt(0);
        return x;
    }
}

