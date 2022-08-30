package day21_practice;

public class Shapes {
    public static void main(String[] args) {
        /*
        Print these shapes:

    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *

-------------------------------------------------------

Print this shape:

    * * * * * * * *
    * * * * * * *
    * * * * * *
    * * * * *
    * * * *
    * * *
    * *
    *

-------------------------------------------------------
         */


        for (int i = 1; i < 9; i++) {

            for (int j = 1; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
            }



        System.out.println("----------------------------------------------------------");

        String str;

        for (int p = 1; p < 9; p++) {
            str = "";
            for (int k = 1; k < 10; k++) {
                str += "* ";
            }
            System.out.println(str);
        }

        System.out.println("-----------------------------------------------");

        for (int d = 1; d < 9; d++) {
            for (int e = 9; e > d ; e--) {
                System.out.print("* ");
            }
            System.out.println();
        }




        System.out.println("-----------------------------------------------");

        String s;
        for (int a = 1; a < 8; a++) {
            s = "";
            for (int b = 8; b > a; b--) {       // a is dynamic, makes b running from 8 to 1, 8 to 2, 8 to 3 etc.
                s += "* ";
            }
            System.out.println(s);
        }






    }
}
