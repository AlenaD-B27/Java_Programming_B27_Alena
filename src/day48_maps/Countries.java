package day48_maps;

import java.util.*;

public class Countries {
    public static void main(String[] args) {

        // key - countries - String
        // value = cities - List<String>

        Map<String, List<String>> countries = new HashMap<>();
        countries.put("United States", new ArrayList<>(Arrays.asList("Chicago", "Dallas", "Irvine", "San Diego", "New York", "Philadelphia", "Madison")));

        // Arrays.asList() ---> immutable list (the size can not be changed)

        System.out.println(countries);

        countries.get("United States").add("Seattle");
        countries.get("United States").get(0);     // first get is from map, then second get is from ArrayList (get in AL is requesting index number)
        System.out.println(countries);

        countries.put("Europe", new ArrayList<>(Arrays.asList("London", "Paris", "Rome", "Istanbul", "Berlin", "Madrid")));
        countries.put("Uzbekistan", new ArrayList<>(Arrays.asList("Tashkent", "Samarkand", "Bukhara", "Fergana", "Urgench", "Khiva", "Bakht")));
        countries.put("Kazakhstan", new ArrayList<>(Arrays.asList("Petropavlovsk", "Astana", "Almaty", "Aktobe", "Kokshetau")));

        System.out.println(countries);

        Scanner input = new Scanner(System.in);
        System.out.println("What country you are going to tour " + countries.keySet());
        String country = input.nextLine();

        for(String eachCity : countries.get(country)){ // iterate through each city of a specific country
            System.out.println("Touring...." + eachCity);
        }

        System.out.println();

        for(Map.Entry<String, List<String>> eachEntry : countries.entrySet()){
            for(String eachCity : eachEntry.getValue()){
                if (eachCity.startsWith("A") || eachCity.endsWith("a")){
                    System.out.println(eachCity);
                }
            }
        }














    }
}
