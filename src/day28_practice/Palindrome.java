package day28_practice;

import java.util.Scanner;

public class Palindrome {
    /*
    create a method that will accept a String and find if it is Palindrome or not (boolean)
     */

    public static boolean isPalindrome (String str){
        String backword = "";
        for (int i = str.length()-1; i >= 0; i--) {
          backword += str.charAt(i);
        }
        if (str.equals(backword)){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your word to check if it's a palindrome:");
        if (isPalindrome(input.next().toLowerCase().trim())){
            System.out.println("It's palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }













}
