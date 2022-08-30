package day03_variables;

public class Store {
    public static void main(String[] args) {

        int numberOfItems=1000;
        System.out.println(numberOfItems + " in the store");

        numberOfItems=700; //it's called reassignment
        System.out.println(numberOfItems + " after the sale");

        int totalAfterShipment=numberOfItems + 5000;
        System.out.println("totalAfterShipment = " + totalAfterShipment); //soutv shortcut - for printing variables


        double totalCost=1000000.99;
        System.out.println("totalCost = " + totalCost);
        totalCost=1_000_000.99;
        System.out.println("totalCost = " + totalCost);

        /* The print result will be completely the same but for YOU or someone else
        to read the program you need it to make readable IN a program.
        So, use underscores to make it readable
         */

        float f=19.99F;
        float f2=100;
        System.out.println("f = " + f);
        System.out.println("f2 = " + f2); // see the printed result has .0 after the number. That's because float or double is used for decimals only. For the integers you use int (byte, long, short).

        long population = 8_000_000_000L; //int doesn't want to read it because the value is too big for int's memory. long can handle bigger numbers. To make Java to read it as long - we just add L (or l, case doesn't matter) at the end of the number.

        long population2 = 1_000_000; // - here's no problem.











    }



}
