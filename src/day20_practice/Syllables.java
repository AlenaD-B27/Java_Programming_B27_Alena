package day20_practice;

import java.util.Scanner;

public class Syllables {
    public static void main(String[] args) {
        /*
        Syllables
    Given a String separated by dashes calculate how many syllables the words are
        Ex:
            Input:
                ja-va
            Output:
                2
         */
        Scanner input = new Scanner(System.in);
        String s = input.nextLine().trim();
        int syllables = 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-' || s.charAt(i) == ' '){
                syllables++;
            }
        }
        System.out.println("syllables = " + syllables);








    }
}
