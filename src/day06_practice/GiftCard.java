package day06_practice;

public class GiftCard {
    public static void main(String[] args) {
//        create a class GiftCard
//
//    declare and assign a gift card variable at 500
//        declare and assign times used at 3
//        print using giftcard and subtract 150 from the amount
//        reduce the times used by one
//        print using giftcard and subtract 99 from the amount
//        reduce the time used by one
//        print information at the end

        double GC = 500;
        int timesUsed = 3;
        System.out.println(GC-=150);
        timesUsed--;
        System.out.println(GC-=99);
        timesUsed--;
        System.out.println("GC = " + GC);
        System.out.println("timesUsed = " + timesUsed);
        System.out.println(500-150-99); // just checking myself












    }
}
