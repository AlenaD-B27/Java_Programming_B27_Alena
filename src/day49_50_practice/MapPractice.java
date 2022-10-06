package day49_50_practice;

import java.util.*;
import java.util.function.Consumer;

public class MapPractice {
    public static void main(String[] args) {

//    Create a map that has a couple data to use. The data will be a name as the key and a salary as the value

        Map<String, Double> map = new HashMap<>(Map.of("Alena", 90_000.00, "Olga", 130_000.00, "Seraphi", 120_000.00, "Cumali", 200_000.00));

        double maxSalaryValue = Integer.MIN_VALUE;
        String maxSalaryKey = "";
        double minSalaryValue = Integer.MAX_VALUE;
        String minSalaryKey = "";
        int counter = 0;
        List<String> losers = new ArrayList<>();

            for(Map.Entry<String, Double> eachKey : map.entrySet()){
                if(eachKey.getValue() > maxSalaryValue){
                    maxSalaryValue = eachKey.getValue();
                    maxSalaryKey = eachKey.getKey();
                }
                if(eachKey.getValue() < minSalaryValue){
                    minSalaryValue = eachKey.getValue();
                    minSalaryKey = eachKey.getKey();
                }
                if(eachKey.getValue() >= 120_000 && eachKey.getValue() <=150_000){
                    counter++;
                }
                if(eachKey.getValue() < 118_000){
                    losers.add(eachKey.getKey());
                }
                map.put(eachKey.getKey(), eachKey.getValue() + 10_000);
            }

        System.out.println("1.1 ----  who has the maximum salary?");
        System.out.println(maxSalaryKey);
        System.out.println("1.2 ---- who has the minimum salary?");
        System.out.println(minSalaryKey);
        System.out.println("1.3 ---- how many employees has the salary between 120k ~ 150K?");
        System.out.println(counter);
        System.out.println("1.4 ---- display the names of the employees who are making less than 118k?");
        System.out.println(losers);
        System.out.println("1.5 ---- increase the salary of each employee by 10K");
        System.out.println(map);

    }
}

