package day05_practice;

public class KgToPounds {
    public static void main(String[] args) {
//        create a class called KgTopounds, and write a program that can convert Kg to pound and print the result
//                Ex:
//        kg = 10;
//        output:
//        10 kg equal to 22.0462 pounds
//                kg = 20
//        output:
//        20 kg equal to 44.0924 pounds
//                ....
//        Hint: 1kg = 2.20462 pounds
//
//                ____________________________________________________________
double kg = 1.00000;
double pound = 2.20462;

        kg=10;
        double result = kg*pound;
        System.out.println(kg+"kg=" + result+"lb");
        kg=20;
        result = kg*pound;
        System.out.println(kg+"kg=" + result+"lb");
        kg=1;
        result = kg*pound;
        System.out.println(kg+"kg=" + result+"lb");








    }
}
