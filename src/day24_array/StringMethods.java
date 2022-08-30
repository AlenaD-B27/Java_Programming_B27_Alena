package day24_array;

import java.sql.SQLOutput;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

      String s = "hello world";
      char [] letters = s.toCharArray();
        System.out.println(letters);
        System.out.println(Arrays.toString(letters));
        System.out.println(s.length());
        System.out.println(letters.length);

        for(char eachLetter : s.toCharArray()){
            System.out.println(eachLetter);
        }

        System.out.println();

        String str = "monday,tuesday,wednesday,thursday,friday,saturday,sunday";
        System.out.println(Arrays.toString(str.split(",")));

        for(String eachDay : str.split(",")){
            System.out.println(eachDay);
        }

        String str2 = "Jan-Feb-Mar-Apr-May-Jun-Jul-Aug-Sep-Oct-Nov-Dec";
        String[] month = str2.split("-");

        for(String eachMonth : month){
            System.out.println(eachMonth);
        }

        String str3 = "mississippi";
        System.out.println(Arrays.toString(str3.split("si")));

        String str4 = "java";
        System.out.println(Arrays.toString(str4.toCharArray())); // char []
        System.out.println(Arrays.toString(str4.split(""))); // String []

    }
}
