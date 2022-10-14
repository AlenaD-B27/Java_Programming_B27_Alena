package day06_operators;

public class RelationalTasks {
    public static void main(String[] args) {

        /*
        declare a speed variable
        speed limit is 50
        find out if you are speeding
        true/false
         */

        int speed = 60;
        int limit = 50;
        boolean isSpeeding = speed > limit;
     //   System.out.println("isSpeeding = " + isSpeeding);

        /*
        declare a number variable
        find out if the number is positive, negative or 0

         */

        double num = 23.90;
        boolean isNegative = num < 0; // 23.90 < 0 --> not true ---> false
        boolean isPositive = num > 0; // 23.90 > 0 ---> true
        boolean isZero = num == 0; // 23.90 = 0 ----> not true ---> false
        System.out.println("isPositive = " + isPositive);
        System.out.println("isNegative = " + isNegative);
        System.out.println("isZero = " + isZero);
        
        // it is operators for PRIMITIVE (any of them) types.

//        System.out.println(true == true);
//        System.out.println('a' == 'A');
//        =========================================================================================
        
        /*
        define a number
        find out if it is even
         */

        /**
         double a = 1;
         boolean isWholeNumber = a == (int) a;
         System.out.println("isWholeNumber = " + isWholeNumber);
         boolean isDecimal = a != (int)a;
         System.out.println("isDecimal = " + isDecimal);

         Here I have figured if the number is integer instead of even. Go learn english, Alena.
         */

        
// how Saim did it:

        int c = 5;
        boolean isEven = num % 2 == 0;
        boolean isOdd = num % 2 != 0;
//        System.out.println("isEven = " + isEven);
//        System.out.println("isOdd = " + isOdd);


    }
}
