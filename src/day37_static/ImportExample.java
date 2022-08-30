package day37_static;

import java.util.Arrays;

import static java.lang.Math.*; // access all static members from from this class, without the class name;
import static java.lang.Integer.*;
import static java.util.Arrays.*;

public class ImportExample {
    public static void main(String[] args) {


        System.out.println(PI);
        System.out.println(MAX_VALUE);
        parseInt(""); // Integer.parseInt();

        int [] a  = {43, 4, 2};
        System.out.println(Arrays.toString(a));
        sort(a); // Arrays.sort();

    }
}
