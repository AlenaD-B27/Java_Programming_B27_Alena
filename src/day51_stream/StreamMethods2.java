package day51_stream;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods2 {
    public static void main(String[] args) {


        // primitive array to a List
        int[] arr = {3, 4, 1, 5, 15, 4};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        /*
            Arrays.stream(arr) --> converts the array to a stream(int)
            .boxed() --> converts the data from int to Integer -> result is Stream<Integer>
         */

        // list to array

        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 5, 1, 5, 5, 12, 5, 2));
        int[] arr2 = list2.stream().mapToInt(n -> n).toArray();

        /*
        list2.stream() --> converts List to a Stream<Integer>
        .mapToInt(n -> n) --> converts each number to an int type
            IF IT WAS A METHOD: public static int mapToInt(Integer i){
                                    return (int)i;
                                }

         */
        System.out.println("---------------------------------------");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(3,5,1,5,5,12,5,2));
        System.out.println(list3.stream().map(n -> n*2).collect(Collectors.toList())); // ---> each element multiplied by 2
        System.out.println(list3); // ---> original

        /*
            IF IT WAS A METHOD: public static int map(Integer i){
                                    return i * 2;
                                }
         */


        List<String> list4 = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday"));
        System.out.println(list4.stream().map(s -> s.substring(0, 3).toUpperCase()).collect(Collectors.toList()));


    }
}
