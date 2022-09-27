package day48_maps;

import day43_practice.web_elements.Link;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacter {
    /*
    apple
    a - 1
    p - 2
    l - 1
    e - 1
     */
    public static void main(String[] args) {

        String str = "apple";
        Map<Character, Integer> counter = new LinkedHashMap<>();

        for(int i = 0; i < str.length(); i++){
            char key = str.charAt(i);
            if(counter.containsKey(str.charAt(i))){

                counter.put(key, counter.get(key) + 1);

            } else {
                counter.put(key, 1);
            }

        }
        System.out.println(counter);












    }
}
