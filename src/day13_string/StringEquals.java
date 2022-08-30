package day13_string;

public class StringEquals {
    public static void main(String[] args) {

    String s = "java";
    String s2 = "java";

    // both are literal so they are both in String Pool

        System.out.println(s == s2); // checks if they are the sabe object, the same location, BUT it doesn't check the VALUE
        System.out.println(s.equals(s2)); // checks if the VALUE of the Strings is the same

        String s3 = new String("java"); // in the heap
        System.out.println(s == s3); // comparing two different objects
        System.out.println(s.equals(s3)); // checks if the VALUE of the Strings are the same

        System.out.println(s.equals("java"));

















    }
}
