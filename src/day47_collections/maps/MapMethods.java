package day47_collections.maps;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {

    // NOTES:
        // SYNTAX:
            // Map<KEY, VALUE> objectName = new HashMap<>();

        // 1. - Key should be unique;
        // 2. - If you use put() with the duplicate key, it will just reassign;
        // 3. - put(KEY, VALUE) method ---> adds to a map;
        // 4. - get(KEY) method ---> returns the VALUE;
                  // if the KEY doesn't exist, so the VALUE is not assigned ---> returns null;
        // 5. - remove(KEY) method ---> removes from a map;
        // 6. - containsKey(KEY)
        //            and
        //    - containsValue(VALUE) ---> returns boolean;
        // 7. - Map.of() works as Arrays.asList();
        // 8. - we CAN NOT loop through a Map, but:
        //    - keySet() method ---> returns the Set of keys,
        //    - values() method ---> returns the Collection of values;
        //                      The elements of Map are called entries;
        //    - entrySet() method ---> returns the Set of entries;
        // 9. - getKey()
        //        and
        //    - getValue() ---> are methods for entry only;



        Map<Character, Integer> gradeScale = new HashMap<>();
        gradeScale.put('A', 90);
        gradeScale.put('B', 80);
        gradeScale.put('C', 70);
        gradeScale.put('D', 60);
        gradeScale.put('Z', 1000);
        gradeScale.put('Z', 3000); // reassigned, as the key is unique

        System.out.println(gradeScale);

        System.out.println(gradeScale.get('B')); // returns value
        System.out.println(gradeScale.get('b')); // returns null (the key is not assigned to any value)

        gradeScale.remove('Z');
        System.out.println(gradeScale);

        System.out.println(gradeScale.containsKey('C'));
        System.out.println(gradeScale.containsKey('c'));

        System.out.println(gradeScale.containsValue(100));


    }
}
