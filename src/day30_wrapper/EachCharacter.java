package day30_wrapper;

import java.util.ArrayList;

public class EachCharacter {
    public static void main(String[] args) {
        String s = "49jaVA$33*&EOWe82";

        String upper = "", lower = "", number = "", special = "";

        for (int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);

            if(Character.isUpperCase(letter)){
                upper += letter;
            }else if(Character.isLowerCase(letter)){
                lower += letter;
            }else if(Character.isDigit(letter)){
                number += letter;
            }else{
                special += letter;
            }

        }

        System.out.println(upper);
        System.out.println(lower);
        System.out.println(number);
        System.out.println(special);


        //===================================================













    }
}
