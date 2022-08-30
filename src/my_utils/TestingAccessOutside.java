package my_utils;

import day38_encapsulation.AccessModifiers;

public class TestingAccessOutside {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.a); // public is accessible in the whole project
      //  System.out.println(obj.b); // is default (not in the same package)
    //    System.out.println(obj.c); // private (not the same class)
    }
}
