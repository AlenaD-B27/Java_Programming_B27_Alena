package day31_arraylist;

import java.util.ArrayList;

public class AddMethod {
    public static void main(String[] args) {




                ArrayList<Character> letters = new ArrayList<>(); // creates an empty ArrayList
                System.out.println(letters.size()); // 0 -> empty
                letters.add('j');
                letters.add('a');
                letters.add('v');
                letters.add('z');
                System.out.println(letters.size()); // number of elements -> 4
                System.out.println(letters);

                // reading from array: arrayName[index]

                // reading elements from the ArrayList
                System.out.println(letters.get(0));
                System.out.println(letters.get(1));
                System.out.println(letters.get(2));
                System.out.println(letters.get(3));

                System.out.println(letters);

                letters.add(0, '$');
                System.out.println(letters);
                System.out.println(letters.get(1));

                letters.add(3, '8');
                System.out.println(letters);



            }
}
