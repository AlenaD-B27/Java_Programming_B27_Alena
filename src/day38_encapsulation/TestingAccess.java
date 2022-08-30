package day38_encapsulation;

public class TestingAccess {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.a); // a is public and accessible in the whole project
        System.out.println(obj.b); // b is default and in the same package
       // System.out.println(obj.c); c is private, and we are outside the class, so no access
    }
}
