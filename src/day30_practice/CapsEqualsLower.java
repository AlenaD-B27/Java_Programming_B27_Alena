package day30_practice;

public class CapsEqualsLower {
    public static void main(String[] args) {
        /*
        Write program that returns true if the total number of uppercase
characters are equal to total number of lowercase characters of a
string

Ex:
    str = "JAVA java";

output:

    true
         */

        String str = "JAVA java";
        int countUpper = 0, countLower = 0;

        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))){
                countUpper++;
            } else if (Character.isLowerCase(str.charAt(i))) {
                countLower++;
            }
        }

        System.out.println(countLower == countUpper);















    }
}
