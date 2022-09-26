package day47_collections.maps;

import java.util.*;

public class MapExamples {
    public static void main(String[] args) {

        Map<Integer,String> map1 = new HashMap<>(); // random order
        // keys are Integer
        // values are String

        // map1.add(); there is no add method
        map1.put(4, "four");
        map1.put(1, "one");
        map1.put(7, "seven");
        map1.put(10, "ten");
        map1.put(-2, "negative 2");
        map1.put(5, "five");
        map1.put(null, "empty");
        System.out.println(map1);

        Map<Integer,String> map2 = new LinkedHashMap<>(); // maintains insertion order
        map2.put(4, "four");
        map2.put(1, "one");
        map2.put(7, "seven");
        map2.put(10, "ten");
        map2.put(-2, "negative 2");
        map2.put(5, "five");
        map2.put(null, "empty");
        System.out.println(map2);

        Map<Integer,String> map3 = new TreeMap<>(); // maintains natural order for the keys
        map3.put(4, "four");
        map3.put(1, "one");
        map3.put(7, "seven");
        map3.put(10, "ten");
        map3.put(-2, "negative 2");
        map3.put(5, "five");
//        map3.put(null, "empty"); null not allowed in TreeMap
        System.out.println(map3);

        Map<Integer,String> map4 = new Hashtable<>(); // random order
        map4.put(4, "four");
        map4.put(1, "one");
        map4.put(7, "seven");
        map4.put(10, "ten");
        map4.put(-2, "negative 2");
        map4.put(5, "five");
//        map4.put(null, "empty"); null key not allowed
//        map4.put(9, null); null values not allowed
        System.out.println(map4);















    }
}
