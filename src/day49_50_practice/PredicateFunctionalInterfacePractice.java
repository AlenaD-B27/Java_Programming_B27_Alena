package day49_50_practice;



import java.util.*;
import java.util.function.Predicate;

// Reconstructed the code from package day30_practice ===>  ValidPassword.java;

public class PredicateFunctionalInterfacePractice {

    public static void main(String[] args) {
        //    Use Predicate Functional interface to:
//      1.1 Create a function that can verify if a number contains duplicate digits

        Predicate<Integer> containsDuplicates = num -> {
            List<Integer> digits = new ArrayList<>();

            while (num != 0) {
                int remainder10 = num % 10;
                digits.add(remainder10);
                num = (num - remainder10) / 10;
            }
            Set<Integer> noDuplicateDigits = new HashSet<>(digits);
            return digits.size() != noDuplicateDigits.size();
        };

        System.out.println("contains duplicate digits: " + containsDuplicates.test(1234));
        System.out.println("contains duplicate digits: " + containsDuplicates.test(122234));


//		1.2 Create a function that can verify if a p is a strong p. Characteristics of strong passwords are:
//    Password must be at least have 8 characters long, and should not contain space
//    Password should at least contain one upper case letter
//    Password should at least contain one lower case letter
//    Password should at least contain one special characters
//    Password should at least contain a digit

        Predicate<String> password = p -> {

            String checker = "Weak password. ";

            System.out.println("Is password " + p + " a strong password?");

            if (p.length() < 8) {
                System.out.println(checker +  "Must have at least 8 characters.");
                return false;
            }
            if (p.contains(" ")){
                System.out.println(checker + "Can not contain space.");
                return false;
            }
            if (p.toLowerCase().equals(p)) {
                System.out.println(checker + "Must have at least 1 uppercase letter.");
                return false;
            }
            if (p.toUpperCase().equals(p)) {
                System.out.println(checker + "Must have at least 1 lowercase letter.");
                return false;
            }

            for (Character each : p.toCharArray()) {
                if (Character.isDigit(each)) {
                    checker = null;
                    break;
                }
            }
            if (checker != null) {
                System.out.println(checker + "Must have at least 1 number.");
                return false;
            }


            String listOfChars = "!@#$%^&*";
            checker = "Weak password. ";

            for (int i = 0; i < p.length(); i++) {
                for (int j = 0; j < listOfChars.length(); j++) {
                    if (p.charAt(i) == listOfChars.charAt(j)) {
                        checker = null;
                        break;
                    }
                }
            }


            if (checker != null) {
                System.out.println(checker + "Must have one of the following special characters: " + listOfChars);
                return false;
            }


        System.out.println("Password " + p + " is a strong password.");
            return true;
        };

        // TEST:
        password.test("5008GHJff!");
        password.test("12345");
        password.test("alenad$$3121");
        password.test("HELLO7WOR%LD");
        password.test("123456789&&0");
        password.test("Alena123Alena");





    }
            }
