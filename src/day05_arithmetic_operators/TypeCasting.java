package day05_arithmetic_operators;

public class TypeCasting {
    public static void main(String[] args) {

        byte b = 14;
        int i = b; //int is bigger, so it's okay.

        long l = 40; //by default 40 is int type, int can automatically be stored into a long cuz int is smaller than long;
        long l2 = 3000000000000L; // by default it is int, but it's too big number, so we need to tell compiler that is it long, so we put L at the end.

        // byte -> short -> int -> long -> float -> double

        double d = 19.99;
        int i2 = (int)d;
        System.out.println("i2 = " + i2);
        // we need casting when we go from bigger types to the smaller ones.

        // dataloss - is when you cast bigger number to a smaller and you "lose" data. 19.99->19 for example.

        int i3 = 500;
        byte b2 = (byte)i3;
        System.out.println("b2 = " + b2); //it's an example of dataloss. If you have dataloss means your code is wrong and you probably should've not done it.

        short s = 60;
        double d3 = s;
        System.out.println("d3 = " + d3);

        float f2 = (float)100.50; /**it equals float f2 = 100.50f, so basically putting F or L at the end of the value is not casting, but very close. It is just TELLING THE COMPILER that it is float number, not CONVERTING the type.
        long l3 = (long)f2;**/









    }
}
