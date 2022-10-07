package day49_50_practice;

import java.util.function.Consumer;

public class ConsumerFunctionalInterfacePractice {
    public static void main(String[] args) {

//        Use Consumer functional interface to:
//
//        1.1	Create a function that prints the first and last element of an array


        Consumer<int[]> firstLast = (arr) -> {
            System.out.println(arr[0] + " " + arr[arr.length - 1]);
        };

        int[] nums = {1, 2, 3, 4, 5};
        firstLast.accept(nums);

//        1.2 Create a function that prints the middle character/s of a String

        Consumer<String> midChars = p -> System.out.println(p.length() % 2 == 0 ? (p.substring((p.length() / 2 - 1), (p.length() / 2 + 1))) : (p.substring((p.length() / 2), p.length() / 2 + 1)));

        midChars.accept("alEna");
        midChars.accept("MicHElle");



}


    }

