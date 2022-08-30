package day06_operators;

public class AgeChecker {
    public static void main(String[] args) {

        int age = 12;

        boolean isChild = age <= 13;
        boolean isSenior = age >= 65;
        System.out.println("isSenior = " + isSenior);
        System.out.println("isChild = " + isChild);
    }
}
