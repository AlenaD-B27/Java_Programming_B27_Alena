package day46_collections;

import java.util.*;

public class ReadFromSets {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(5);
        set.add(12);
        set.add(34);
        set.add(-1);
        set.add(9);
        System.out.println(set);

        // get method is not available for Set, how do we access the elements?

        for(int each : set){
            if(each > 10){
                System.out.println(each);
            }
        }

        Set<String> handles = new HashSet<>();
        handles.add("daad2141124");
        handles.add("dseujdfsk233");

        for(String each : handles){
            if(!each.equalsIgnoreCase("daad2141124")){
                // switch to the other handle
            }
        }

        Set<String> set3 = new HashSet<>();
        set3.add("hello");
        set3.add("java");
        set3.add("world");
        set3.add("bye");
        System.out.println(set3);

        List<String> list = new ArrayList<>(set3);
        System.out.println(list);
        System.out.println(list.get(0));


        // remove duplicates:
        String s = "AAAABBBBCCCCCDDDD";
        System.out.println(new LinkedHashSet<>(Arrays.asList(s.split(""))));
        //========================================================


















    }
}
