package replit;

import java.util.Scanner;

public class UniqueChars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }

    public static String uniqueChars(String str) {
        //TODO: write your code

        String newStr = "";

        for (int i = 0; i < str.length(); i++){
            String characterAti = ""+ str.charAt(i);
            if(!newStr.contains(characterAti)){
                newStr += str.charAt(i);
            }
        }

        return newStr;

    }
}
