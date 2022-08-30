package day31_practice;

import java.util.ArrayList;

public class Remove {
    public static void main(String[] args) {
     /*
     Create an ArrayList of Strings
add these elements:
    Iron Man, Spider Man, Thor, Captain America, Hawkeye

    remove Thor by index

    remove Iron Man by element

    remove the first index

Print the ArrayList after each action to see how the change is made
      */

        ArrayList<String> superheroes = new ArrayList<>();
        superheroes.add("Iron Man");
        superheroes.add("Spider Man");
        superheroes.add("Thor");
        superheroes.add("Captain America");
        superheroes.add("Hawkeye");

        System.out.println(superheroes);

        superheroes.remove(2);
        System.out.println(superheroes);

        superheroes.remove("Iron Man");
        System.out.println(superheroes);

        superheroes.remove(0);
        System.out.println(superheroes);















    }
}
