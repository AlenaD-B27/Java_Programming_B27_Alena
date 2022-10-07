package day49_functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuiltInExamples {
    public static void main(String[] args) {

        // Predicate<T> is a build in functional interface.
        // Predicate has a test(T t) method which returns boolean

        Predicate<Integer> isPrime = p -> {

            if(p < 2) return false;

            for (int i = 2; i < p/2; i++){
                if(p % i == 0){
                    return false;
                }
            }
            return true;
        };

        System.out.println(isPrime.test(8));
        System.out.println(isPrime.test(-4));
        System.out.println(isPrime.test(7));

        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 5, 21, 6, 11, 12, 4, 15, 1, 2, 5, 1, 2, 4, 1, 5, 12, 3, 5, 12, 32, 5, 15, 2));

        nums.removeIf(isPrime);
        System.out.println(nums);

        nums = new ArrayList<>(Arrays.asList(1, 5, 21, 6, 11, 12, 4, 15, 1, 2, 5, 1, 2, 4, 1, 5, 12, 3, 5, 12, 32, 5, 15, 2));
        nums.removeIf(p -> p < 10);
        System.out.println(nums);

        System.out.println("------------------------------------");

        // Consumer<T> is a build in functional interface.
        // Consumer has an accept(T t) method which returns void

        Consumer<int []> printArray = arr -> {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " - ");
            }
        };

        printArray.accept(new int[]{3, 6, 8});

        List<String> words = new ArrayList<>(Arrays.asList("java", "soft skills", "house", "shed", "garden", "emoji", "fun"));
        words.forEach(each -> System.out.println(each));

        System.out.println("-----------------------------------------");

        words.forEach(each -> {
            System.out.println("" + each.charAt(0) + each.charAt(each.length() -1 )); // we want to print first and last chars
            System.out.println(each);
        });
        System.out.println("======");

        words.forEach(each -> System.out.println(each.substring(0, 3))); // print first 3 chars of each word


        System.out.println("--------------------------------------------");

        // Function<T,R> is a build in functional interface. ---> R is any return type
        // Function has an apply(T t) method which returns R.

        Function<int [], List<Integer>> convertToList = (arrNums) -> {
            List<Integer> list = new ArrayList<>();
            for(int each : arrNums){
                list.add(each);
            }
            return list;
        };

        int[] arr1 = {3,4,5,5,6,7,8};
        List<Integer> list1 = convertToList.apply(arr1);

        System.out.println(list1);

        System.out.println("----------------------------------");

        Function<int[], int[]> swapElements = array -> {

            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;
            return array;

        };

        System.out.println(Arrays.toString(swapElements.apply(new int[]{4, 1, 5, 12, 5, 2, 69, 120, 249})));


    }
}
