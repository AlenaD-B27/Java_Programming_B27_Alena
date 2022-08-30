package day39_inheritance.access.b;

import day39_inheritance.access.a.House;

public class Townhouse extends House {
    public static void main(String[] args) {

        // Q: What does TownHouse inherit from House?

        // in different packages

        Townhouse house = new Townhouse();
        house.address = "123134 road";
        house.city = "Fairfax";
        // did I inherit the city variable? yes
//        house.state;  state is default, so only accessible in the same package
//        house.zipcode zipcode is private, so only accessible in the same class

    }
}
