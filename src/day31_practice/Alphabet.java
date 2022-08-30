package day31_practice;

import java.util.ArrayList;

public class Alphabet {
    public static void main(String[] args) {


//        Create an ArrayList of Characters
        ArrayList<Character> alphabet = new ArrayList<>();

//        Fill the ArrayList with letters from a-z

        for (char i = 'a'; i <= 'z'; i++) {
          alphabet.add(i);
        }
//        Print the ArrayList of all the characters

        System.out.println(alphabet);

//        Manually remove each vowels and print the new ArrayList

        alphabet.remove((Character) 'a');
        // as different approach:
        alphabet.remove(alphabet.indexOf('e'));
        alphabet.remove(alphabet.indexOf('i'));
        alphabet.remove(alphabet.indexOf('o'));
        alphabet.remove(alphabet.indexOf('u'));

        System.out.println(alphabet);




    }
}
