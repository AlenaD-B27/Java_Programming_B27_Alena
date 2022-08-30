package day06_operators;

public class CharIncrement {
    public static void main(String[] args) {

    char letter = 'A';
    System.out.println(letter++);
    System.out.println(letter++);
    System.out.println(letter++);
    System.out.println(letter++);
    System.out.println();

    char letter2 = 'a';
    System.out.println(++letter2); // pre increment, so the 1 is added first, then the expression finishes
    System.out.println(++letter2);
    System.out.println(++letter2);
    System.out.println(++letter2);

    char digits = '9';
    System.out.println(digits--);
    System.out.println(digits--);
    System.out.println(digits--);
    System.out.println(digits--);

        System.out.println(65);
        System.out.println((char)65); //casting int into char

        System.out.println('a');
        System.out.println((int)'a');



}

}
