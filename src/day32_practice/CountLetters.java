package day32_practice;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CountLetters {
    /*
    Create a method that will accept an ArrayList of Strings and a letter (char) print how many times the letter is found in the ArrayList elements

Ex:
Input:
	”java”, ”html”, “css”, “java”, “javascript”, “selenium”
	letter: ‘a’
Output:
	6
     */
    public static int frequencyOfCharacterInArrayList (ArrayList<String> arrStr, char ch ){

        int count = 0;

        for (String eachStr: arrStr){


            for(int i = 0; i < eachStr.length(); i++){

                if(eachStr.charAt(i) == ch){
                    count++;
                }


            }

        }

        return count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("input words, separate with space only");
        String str = input.nextLine();
        String [] arr = str.split(" ");
        ArrayList<String> check = new ArrayList<>(Arrays.asList(arr));
        System.out.println("input character");
        char ch = input.next().charAt(0);
        System.out.println(frequencyOfCharacterInArrayList(check, ch));


    }



}
