package day10_11_practice;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {

        //                create a class ChooseLanguage
//
//ask the user to enter a number based on the language they wanted to use.
//        1 - English
//        2 - Spanish
//        3 - Turkish
//        4 - Russian
//        5 - French
//
//        based on the number they picked print a message:
//
//        1 : "hello, thank for your call"
//        2 : "hola, gracias para llamar"
//        3 : "merhaba, aradiginiz icin tesekkurler"
//        4 : "privet, spasibo za vash zvonok"
//        5 : "Merci ,pour votre appel"
//        any other number: "We will use English by default"
//
//        Extra: add your own options
//
//        -----------------------------------------------------------

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the language (use the number): 1 - English, 2 - Spanish, 3 - Turkish, 4 - Russian, 5 - French");
        int language = input.nextInt();
        System.out.println(language == 1 ? "hello, thank for your call" : language == 2 ? "hola, gracias para llamar" : language == 3 ? "merhaba, aradiginiz icin tesekkurler" : language == 4 ? "privet, spasibo za vash zvonok" : language == 5 ? "Merci ,pour votre appel" : "invalid number, try again");


















    }
}
