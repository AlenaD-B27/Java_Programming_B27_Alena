package day47_collections.maps.people;

import java.util.HashMap;
import java.util.Map;

public class GroupOfPeople {
    public static void main(String[] args) {

        Map<Integer, Person> residents = new HashMap<>();
        // idea: apartment (key), person (value)

        residents.put(201, new Person("James", 40));
        residents.put(202, new Person("Anna", 20));
        residents.put(203, new Person("Faith", 35));
        residents.put(204, new Person("James", 40));

        System.out.println(residents); // prints the map
        System.out.println(residents.get(202)); // returns the value of key 202 -> value is a Person object
        System.out.println(residents.get(202).name); // accessing the name variable from the person object
        System.out.println(residents.get(202).name.substring(0,2));




    }
}
