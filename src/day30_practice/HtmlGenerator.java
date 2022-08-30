package day30_practice;

import java.util.Scanner;

public class HtmlGenerator {
    public static void main(String[] args) {
        /*
        Given a String in the following format take the number part of the generator the html tags.
    Tags are surrounded with diamond brackets. The number of times to repeat with be given as the number after the ^

    Ex:
        Input:
            div^2
        Output:
            <div></div> <div></div>

    Ex:
        Input:
            li^3
        Output:
            <li></li><li></li><li></li>
         */

        Scanner input = new Scanner (System.in);
        String generator = input.next();


        String tag = generator.substring(0, generator.indexOf('^')); // caret is the name of the character ^
        int repeat = Integer.parseInt(generator.substring(generator.indexOf('^') + 1));

        String result = "";

        for (int i = 1; i <= repeat; i++) {
            result += "<" + tag + ">" + "</" + tag + ">";
        }

        System.out.println(result);












    }
}
