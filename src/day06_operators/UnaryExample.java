package day06_operators;

import java.sql.SQLOutput;

public class UnaryExample {
    public static void main(String[] args) {

     int n = 0; //0
     n++; // post increment, value becomes 1
        System.out.println(n); //1

        ++n; // pre increment, value becomes 2

        System.out.println(n); // 2


        System.out.println(++n); //pre increment, value becomes 3, then it prints 3;
        System.out.println(n++); // post increment, it prints 3, then value becomes 4;

        System.out.println("-------------------------------------------------------");

        int x = 4;
        int y = x;
        int z = ++x;
        System.out.println("x = " + x); // 4 ---> 5, because we just incremented it (line 22). You incremented x, not z!!!
        System.out.println("y = " + y); // 4
        System.out.println("z = " + z); // 5

        System.out.println("----------------------------------------------------------------------");

        int candy = 5;
        System.out.println("your kid asks for candy, you have " + candy);
        System.out.println("you give them 1, so now you have " + --candy);
        System.out.println("The sibling comes in and they want one, you check how many you have and THEN give them one " + candy--);
        System.out.println("Total candy in jar now " + candy);

        // USE CASE: counting:
        // your name, we want to find how many times you name has the letter 'a'
        int counter = 0;
        counter++;
        //we find another a, now we need to add it to count:
        counter++;














    }
}
