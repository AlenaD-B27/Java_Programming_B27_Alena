package day24_practice;

import java.util.Scanner;

public class LongestPalindrome {
    /*
    Given a String array. Find the longest Palindrome String in your array.

		Ex:
		Input:
			["java", "longer word", "civic", "apple", "racecar", "mom", "anna"]
		Output: racecar

		Ex:
		Input: ["abc", "dna", "kevin", "joe", "lamp"]
		Output: No palindrome
     */
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
//        int length = input.nextInt();
//        String [] str = new String [length];
//        for (String eachStr : str) {
//            eachStr = input.next();
//        }

String [] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
String reverseWordsStr = "";


for(String eachWord: words){
    String reverse = "";
    for (int i = eachWord.length()-1; i >= 0 ; i--) {
        reverse += eachWord.charAt(i);
    }
    reverseWordsStr += reverse + ", ";
}

String reverseWordsArr [] = reverseWordsStr.split(", ");
int count = 0;
String palindromesOnly = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(reverseWordsArr[i])) {
                count++;
                palindromesOnly += words[i] + "#";
            }
        }
String [] palindromesArr = palindromesOnly.split("#");
        String max = palindromesArr[0];

if (count == 0){
    System.out.println("No palindrome found.");
}else{


    for (int i = 0; i < palindromesArr.length; i++) {
       if(palindromesArr[i].length() > max.length()){
         max = palindromesArr[i];
       }
    }


}

        System.out.println(max);











    }
}
