package day45_polymophism.building;

import java.util.ArrayList;

public class BuildingMarket {

            /*
        With ArrayList

    create a class BuildingMarket
    create a main method

    create an ArrayList of Building
        -> this can hold objects of House, Apartment, & OfficeBuilding

    create a bunch of House, Apartment, & OfficeBuilding objects and store them into the ArrayList

    mini tasks:

        - Find the most expensive Buildings, print all its information
        - Find the least expensive Buildings, print all its information
        - Filter all the Buildings in one location(ex search for buildings in Chicago)
        - Filter all the Buildings within a certain price range
         */

    public static void main(String[] args) {

        ArrayList<Building> allBuildings = new ArrayList<>();
        allBuildings.add(new House("New York", 400_000, 4));
        allBuildings.add(new Apartment("Texas", 3_000_000, 6));
        allBuildings.add(new OfficeBuilding("Virgina", 20_000_000, 6));
        allBuildings.add(BuildingUtil.search("McLean")); // added the OfficeBuilding from the search method
        allBuildings.add(BuildingUtil.search("Great Falls")); // added House obj

        Building mostExpensive = allBuildings.get(0); // just a default value

        for(Building each : allBuildings){ // iterating through the Building objects from the allBuildings arraylist
            if(each.price > mostExpensive.price){
                mostExpensive = each;
            }
        }
        System.out.println(mostExpensive);

        //  Filter all the Buildings within a certain price range
        ArrayList<Building> filteredBuildings = new ArrayList<>(allBuildings);

        filteredBuildings.removeIf(p -> p.price >= 2_000_000 || p.price <= 300_000);
        System.out.println(filteredBuildings);





    }

}

