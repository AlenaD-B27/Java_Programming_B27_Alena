package day49_practice;

import java.util.Arrays;
import java.util.function.Function;

public class FunctionFunctionalInterfacePractice {
    public static void main(String[] args) {
//        Use Function functional interface to:
//        1.1 Create a function that can return the sum of digits from a string that contains number digits
        Function<String, Integer> digitsSumFromStr = p -> {
            Integer sum = 0;
            Character [] chars = new Character[p.length()];
            for (int i = 0; i < p.length(); i++) {
                chars[i] = p.charAt(i);
                if(Character.isDigit(chars[i])){
                    sum += Integer.parseInt(p.substring(i, i+1));
                }
            }
            return sum;
        };

        System.out.println(digitsSumFromStr.apply("Hello123World312"));

//        1.2 Create a function that can return the reversed version of a String array

        Function<String [], String []> reverseArr = p -> {
          String [] reversed = new String[p.length];
            for (int i = 0, j = p.length-1; i < p.length; i++, j--) {
                reversed[i] = p[j];
            }
            return reversed;
        };

        System.out.println(Arrays.toString(reverseArr.apply(new String[]{"Alena", "is", "tired", "and", "needs", "to", "sleep"})));


    }
}
