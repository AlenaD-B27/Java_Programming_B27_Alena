package MY_QUESTIONS;

public class MyQuestion03_QuizCastingNeeded_Solved {
    public static void main(String[] args) {

        long l = 200L;
        double d = 12.99;
        float f = 10;
        f = (float)d;
        f = l;
        l = (long)d;
        l = (long)f;
        d = f;
        d = d;

// byte -> short -> int -> long -> float -> double
        // TODO learn the line by heart
        // you need to cast when you convert the smaller one to bigger one

        int a = 40;
        double b = 10.01;
       b = a;
        System.out.println(a);
        System.out.println(b);

        




    }
}
