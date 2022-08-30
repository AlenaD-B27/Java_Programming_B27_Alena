package day29_methods;

import my_utils.StringUtil;

public class DuplicateCharacters {
    /*
      Given a String, find and print the duplicate characters. A character is duplicate if it appears more than once in the String.

    Ex:
        Input:
            AAABCCDEEF
        Output:
            ACE

        -> the characters A C and E are found in the String multiple times so they are duplicates
     */

    public static String getDuplicateCharacters (String str){
String duplicate = "";
        for (int i = 0; i < str.length(); i++) {
            if (duplicate.contains(""+ str.charAt(i))){
                continue;
            }
            int frequency = StringUtil.frequencyOfChar(str, str.charAt(i));
            if (frequency > 1){
                duplicate += str.charAt(i);
            }
        }
        return duplicate;
    }


    public static void main(String[] args) {
        System.out.println(getDuplicateCharacters("ksdhgfeHjdkhksdv" ));



    }
}
