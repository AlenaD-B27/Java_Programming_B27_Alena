package day13_string;

public class StringObjects {
    public static void main(String[] args) {

        String s = "first"; // String literal, in String pool
        String s2 = new String("second"); // object in the heap

        System.out.println(s == s2); // compares two different objects

        String s3 = new String("first");

        System.out.println(s == s3); // compares objects in two different locations

        String s4 = "second";

        System.out.println(s == s4);

        String s5 = "first";
        System.out.println(s == s5); // the same object, so they have the same address --> true





    }
}
