package day07_scanner;

public class ShortCircuitEx {
    public static void main(String[] args) {
        System.out.println(true && true); // true
        System.out.println(false && true); // false
        // you can not divide by 0
//        System.out.println(5/0);

      //  System.out.println(true && 5/0 == 0);
        System.out.println(false && 5/0 == 0);// Java reads from the left to the right. False as a 1st option ALREADY makes the result false, so it even doesn't read 5/0 as the program result is ready, so it will not give you the error.

       // System.out.println(false & 5/0 == 0); // Will give you the error as & let's it read the full line. That's why we always use &&, to make sure that the code works. Same thing with OR (||) ==> if the first one is true then there's no reason to check the second result.

        int count = 0;
        System.out.println(true || count++ == 1);
        System.out.println(count); // 0! Yes, because Java skipped reading/running the rest of the code in the line, so it didn't increment count.
        System.out.println(true | count++ == 1);
        System.out.println(count); // 1! as we used | not || so Java reads/runs the full line. So count IS incremented.







    }
}
