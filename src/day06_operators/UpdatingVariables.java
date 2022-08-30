package day06_operators;

public class UpdatingVariables {
    public static void main(String[] args) {

        int n = 10;

        // reassign a new value;
        n = 20;

        int a = 3;
        a = a + 4;

        int b = 15;
        b += 9;
        b += 1;

        int z = 10;
        z++;

        /*
        updating number by 1:
        z = 11;
        or
        z = z + 1;
        or
        z += 1;
        or
        z++; or ++z;

         */

        int java = 8;
        int testing = --java;

        System.out.println(java); // 8 ---> 7 and it is 7 ALREADY
        System.out.println(testing); // 7

        int x = 7;
        int y = x--;

        System.out.println(x); // 6, because it is POST decrement and the last saved action is -- which means java already knows x as decremented.
        System.out.println(y); // 7 --> it reads from the left to the right so it reads: y = (x)!!!! before --

    }
}
