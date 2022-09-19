package day45_polymophism.learn_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetObjects {
    public static void main(String[] args) {

        /*
        Set:
        unordered (no indexes, no get method)
        no duplicates (accepts them but ignores)
         */

        Set<String> set1 = new HashSet<>();
        // HASHSET FOLLOWS HASHING ALGORITHM WHICH MEANS HANDLES DATA FAST AND EFFICIENTLY DATA STRUCTURE THAT USES HASHMAP INTERNALLY
        set1.add(null); // accepts default values
        set1.add("hello world");
        set1.add("5.0");
        set1.add("#zebra");
        set1.add("hello world");
        set1.add("Java");
        System.out.println(set1); // the order looks random but internally it has some kind of hash algorithm
        // [null, Java, #zebra, 5.0, hello world]
        // the order DOESN'T MATTER here, the point is to STORE data, not reading

        Set<String> set2 = new LinkedHashSet<>();
        set2.add(null); // accepts default values
        set2.add("hello world");
        set2.add("5.0");
        set2.add("#zebra");
        set2.add("hello world");
        set2.add("Java");
        System.out.println(set2); // maintains the input order
        // [null, hello world, 5.0, #zebra, Java]

        Set<String> set3 = new TreeSet<>();
        // set3.add(null); // doesn't accept the default value
        set3.add("hello world");
        set3.add("5.0");
        set3.add("#zebra");
        set3.add("hello world");
        set3.add("Java");
        System.out.println(set3); // maintains the natural/lexicographical/SORTED order
        // [#zebra, 5.0, Java, hello world]


    }
}
