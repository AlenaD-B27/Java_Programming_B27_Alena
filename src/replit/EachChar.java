package replit;

import java.util.Scanner;

public class EachChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str){

        String result = "";

        int count = 0;


        for(int j = 0; j < str.length(); j++){
            count = 0;
            String charAtIndex = "" + str.charAt(j);

            if(!result.contains(charAtIndex)){
                for (int i = 0; i < str.length(); i++){
                    if (str.charAt(j) == str.charAt(i)){
                        count++;
                    }
                }
                result += "" + count + str.charAt(j);
            }
        }



        return result;
    }

}
