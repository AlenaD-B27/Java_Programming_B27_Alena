package day09_if_statements;

public class Letters {
    public static void main(String[] args) {
        char letter = '#';

        if (letter >= 'A' && letter <= 'Z') {
            System.out.println(letter + " is an uppercase letter");
        }


        if (letter >= 'a' && letter <= 'z') {
            System.out.println(letter + " is a lowercase letter");
        }


    }
}
