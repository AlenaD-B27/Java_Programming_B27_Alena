package day51_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {

        // Create stream
        List<Integer> list1 = new ArrayList<>(Arrays.asList(3, 4, 6, 12, 5));
        list1.stream(); // creates the stream, Need to do more
        System.out.println(list1.stream());

        int[] arr1 = {3, 5, 6, 12, 5};
        Arrays.stream(arr1); // made stream from array

        // distinct : removes duplicates
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 1, 2, 3, 4, 5, 6, 6, 7, 6, 5, 4, 2, 4, 1, 5, 7, 4, 2));

        System.out.println("distinct: " + list2.stream().distinct().collect(Collectors.toList())); // just print
//        list2 = list2.stream().distinct().collect(Collectors.toList()); just reassign back into the same reference
//        List<Integer> newRef = list2.stream().distinct().collect(Collectors.toList()); // can create new reference to store the new data
        System.out.println("list2: " + list2);
        /*
            .stream() -> converts the list to a stream
            .distinct() -> removes all the duplicates from the Stream
            .collect(Collectors.toList()) -> converts the Stream to a List type
         */

        int[] arr2 = {1, 1, 1, 2, 1, 2, 3, 4, 5, 6, 6, 7, 6, 5, 4, 2, 4, 1, 5, 7, 4, 2};
        arr2 = Arrays.stream(arr2).distinct().toArray();
        System.out.println("distinct w/ array: " + Arrays.toString(arr2));

        System.out.println("===============================================");

        // skip(n): skips/removes the n number of elements

        List<String> list3 = new ArrayList<>(Arrays.asList("summer", "bike", "fall", "raining", "pond", "lake", "fishing", "sun"));
        System.out.println(list3.stream().skip(3).collect(Collectors.toList()));
        System.out.println(list3);
        System.out.println(list3.stream().skip(6).collect(Collectors.toList()));
        System.out.println(list3.stream().skip(10).collect(Collectors.toList()));
        System.out.println(list3);

        System.out.println("================================================");

        // limit(): keep a certain number of elements

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list4.stream().limit(5).collect(Collectors.toList()));

        // using both limit and skip together

        System.out.println(list4.stream().limit(6).skip(2).collect(Collectors.toList()));
        // 1,2,3,4,5,6,7,8,9,10 ---> limit(6) ---> keep the first 6 ---> 1,2,3,4,5,6 ---> skip(2) ---> remove the first 2 ---> 3,4,5,6
        System.out.println(list4.stream().skip(6).limit(2).collect(Collectors.toList()));
        // 1,2,3,4,5,6,7,8,9,10 ---> skip(6) ---> remove the first 6 ---> 7,8,9,10 ---> limit(2) ---> keep the first 2 ---> 7,8

        System.out.println("=================================================");

        // count: how many elements/data are in the stream?

        List<Integer> list5 = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 1, 2, 3, 4, 5, 6, 6, 7, 6, 5, 4, 2, 4, 1, 5, 7, 4, 2));
        System.out.println(list5.stream().count()); // ---> counted
        System.out.println(list5.stream().distinct().count()); // ---> removed duplicates and than counted


        // task: given a String, determine the number of unique characters
        String s = "alenasiarheyeunadarazhei";
        System.out.println(Arrays.stream(s.split("")).distinct().count());
        System.out.println(Arrays.stream(s.split("")).distinct().collect(Collectors.toList()));


    }

}
