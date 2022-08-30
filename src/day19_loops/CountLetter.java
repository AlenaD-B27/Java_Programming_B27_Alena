package day19_loops;

import java.util.Scanner;

public class CountLetter {
    public static void main(String[] args) {
        // frequency


        String s = new Scanner(System.in).nextLine();
        int count = 0;

        for(int i = 0; i <= s.length() - 1; i ++){
            if(s.charAt(i) == 'a'){
                count++;
            }
        }

        System.out.println(count);







    }
}
