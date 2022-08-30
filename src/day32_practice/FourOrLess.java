package day32_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess {
    /*
    Given an ArrayList of Strings, go through and find Strings that are 4 characters or less. Take those Strings and put them into a different ArrayList. Print that ArrayList of words

Ex:
	Input:
		“apples”, “tree”, “loop, “cat”, “animal”, “shortcut”
	Output:
		 [ tree, loop, cat ]
     */
    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<>(Arrays.asList("apples", "tree", "loop", "cat", "animal", "shortcut"));
        ArrayList<String> newStr = new ArrayList<>();

        for (String eachStr: str){
            if (eachStr.length() <= 4){
                newStr.add(eachStr);
            }
        }

        System.out.println(newStr);










    }

}
