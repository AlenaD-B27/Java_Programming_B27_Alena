package day48_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBaseExample {
    /*

    Person
      FIRST_NAME
      LAST_NAME
      AGE
      ADDRESS

     */
    public static void main(String[] args) {

        Map<String, String> person1 = new HashMap<>();
        person1.put("FIRST_NAME", "James");
        person1.put("LAST_NAME", "Bond");
        person1.put("AGE", "40");
        person1.put("ADDRESS", "131 Park Dr, London");

        System.out.println(person1.get("FIRST_NAME"));


        List<Map<String, String>> allPeople = new ArrayList<>();
        allPeople.add(person1);
        allPeople.add(Map.of("FIRST_NAME", "Alena", "LAST_NAME", "Darazhei", "AGE", "27", "ADDRESS", "6754 N Lakewood Ave, Chicago"));

        System.out.println(allPeople);

        System.out.println(allPeople.get(0)); // gets the first element of ArrayList. The elements are Maps.
        System.out.println(allPeople.get(0).get("FIRST_NAME")); // reads the first ArrayList element, which is a Map, then it gets the value based on the key FIRST_NAME

        // TC: Verify all the users in the db are unique

        // TC: Verify if the information entered on the UI is the same that went into the DB

        // TC: AGE should not be empty

        for(Map<String, String> eachPerson : allPeople){
            if(eachPerson.get("AGE") == null){
                System.out.println("FAIL");
            }
        }



    }
}
