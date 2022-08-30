package day31_practice;

import java.util.ArrayList;

public class EachLetterEachLine {
    public static void main(String[] args) {
      /*
      Create an ArrayList of Characters
Fill the ArrayList with letters of your name. Each letter as a different element
Print each letters on a separate line by accessing each element
       */

        ArrayList<Character> name = new ArrayList<>();

        name.add('A');
        name.add('l');
        name.add('e');
        name.add('n');
        name.add('a');

        System.out.println("Last index = " + (name.size() - 1));


        System.out.println(name.get(0));
        System.out.println(name.get(1));
        System.out.println(name.get(2));
        System.out.println(name.get(3));
        System.out.println(name.get(4));

        System.out.println("======== try to loop =============");

        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));
        }















    }
}
