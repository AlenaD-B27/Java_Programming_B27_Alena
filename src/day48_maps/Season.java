package day48_maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Season {
    public static void main(String[] args) {
        // avg temp for each season

        Map<String, Double> temperature = new HashMap<>();
        temperature.put("summer", 85.0);
        temperature.put("fall", 65.2);
        temperature.put("winter", 30.5);
        temperature.put("spring", 68.2);
        System.out.println(temperature);

        // find the avg temp for all seasons

        System.out.println("Average for winter " + temperature.get("winter"));
        System.out.println("Average for spring " + temperature.get("spring"));

        System.out.println(temperature.containsKey("mid summer"));
        System.out.println(temperature.containsValue(100.0));

        // are there any duplicate values
        System.out.println(temperature.values());
        int before = temperature.values().size();
        int after = new HashSet<>(temperature.values()).size();

        System.out.println((before == after ? "No duplicate" : "Duplicate values"));


        // find the average temperature for all seasons

        System.out.println(avgTemp(temperature));


    }



    public static double avgTemp(Map<String, Double> map){
        double average = 0;

        for(double eachTemp : map.values()){
            average += eachTemp;
        }
        return average/ map.size();
    }













}
