package day32_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateParts {
    /*
    Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters

Ex:
str = "ABCD123$%#@&456EFG!"
list1: {$, %, #, @, &, !}
list2: {A, B, C, D, E, F, G}
list3: {1, 2, 3, 4, 5, 6}
     */
    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";


        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        ArrayList<Character> list3 = new ArrayList<>();

        for (int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
               list3.add(str.charAt(i));
            }else if(Character.isLetter(str.charAt(i))){
                list2.add(str.charAt(i));
            }else{
                list1.add(str.charAt(i));
            }
        }


        System.out.println("Special characters: " + list1);
        System.out.println("Letters: " + list2);
        System.out.println("Numbers: " + list3);











    }
}
