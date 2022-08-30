package day21_nested_loop;

public class UniqueCharacter {
    public static void main(String[] args) {
        /*

        java

        given a String find the print all the unique characters

        unique character: only appears in the String once

        output:
        jv

     */

        String str = "java";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }

            }

            if (count == 1) {

                System.out.println(str.charAt(i));
            }
        }


    }


}
