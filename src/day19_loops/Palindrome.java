package day19_loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s = input.next();
        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i --){
            reverse += s.charAt(i);
        }

        if(s.equals(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }









    }

}
