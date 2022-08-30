package GROUP_PRACTICE.problem_solving;

import java.util.Scanner;

public class FrequencyOfChar {
    public static String countLetters(String str) {

    int count = 0;
    String newStr = "";


        for (int j = 0; j < str.length(); j++) {

            String bufferChar = "" + str.charAt(j);
            count = 0;

            if(!newStr.contains(bufferChar)) {


                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }
                newStr +="" + count + str.charAt(j);
            }

        }

            return newStr;
    }


    public static void main(String[] args) {

        System.out.println(countLetters("abracadabra"));


        Scanner input = new Scanner (System.in);
        System.out.println("Enter String:");
        System.out.println(countLetters(input.nextLine()));


    }

}
