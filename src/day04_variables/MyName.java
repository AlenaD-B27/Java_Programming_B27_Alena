package day04_variables;

import java.sql.SQLOutput;

public class MyName {
    public static void main(String[] args) {

        char fst = 'A';
        char scnd = 'l';
        char thrd = 'e';
        char frth = 'n';
        char ffth = 'a';

       // System.out.println(fst+scnd+thrd+frth+ffth); - will not work like that because char is a character, it will transfer all your characters to the numbers and now, Alena, your name is 481, lol.

//        1st solution: you can use print instead of println:
        System.out.print(fst);
        System.out.print(scnd);
        System.out.print(thrd);
        System.out.print(frth);
        System.out.print(ffth);
        System.out.println(); // I need to go to the new line or it will continue to print at the same line as print is not println. or I could do println at the line 22.


//        2nd solution: include text in "" and Java will think characters. As everything in "" is the string of characters, the println will just "connect" everything to it when we use + :

        System.out.println("my name is " + fst+scnd+thrd+frth+ffth);
        // OR
        System.out.println(""+fst+scnd+thrd+frth+ffth);







    }



}
