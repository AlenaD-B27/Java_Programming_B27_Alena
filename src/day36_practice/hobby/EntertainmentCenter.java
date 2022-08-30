package day36_practice.hobby;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class EntertainmentCenter {
    public static void main(String[] args) {

        //    Create a separate class to create and test the Hobby objects
//
//        - create an ArrayList of Hobby objects
        ArrayList<Hobby> listOfActivities = new ArrayList<>();

//        - create and add a couple Hobby objects
        Hobby one = new Hobby("chess", 600, false, false);
        Hobby two = new Hobby("basketball", 1500, false, true);
        Hobby three = new Hobby ("badminton", 150, true, true);
        Hobby four = new Hobby ("collecting butterflies", 0, true, false);
        Hobby five = new Hobby("puzzles", 200, false, false);
        Hobby six = new Hobby ("Sprinting", 0, true, false);
        Hobby seven = new Hobby ("Soccer", 900, true, true);

        listOfActivities = new ArrayList<>(Arrays.asList(one, two, three, four, five, six, seven));



//        - iterate through the ArrayList and execute the doIt() method on each Hobby object:

        for (Hobby each : listOfActivities){
            System.out.println(each.doIt());
        }
        System.out.println("=============================");
//        - create a copy ArrayList and remove all outdoors Hobbies
        ArrayList<Hobby> indoor = new ArrayList<>(listOfActivities);
        indoor.removeIf(p -> p.isOutdoors);
        System.out.println("Indoor hobbies: \n" + indoor);
        System.out.println("===============================");
//        - create a copy ArrayList and remove all hobbies requiring other people
        ArrayList<Hobby> forLonelyPpl = new ArrayList<>(listOfActivities);
        forLonelyPpl.removeIf(p -> p.needTeam);
        System.out.println("Can do alone: \n" + forLonelyPpl);
        System.out.println("===================================");
//        - create a copy ArrayList and remove all hobbies that cost more than $500 annually
        ArrayList<Hobby> cheap = new ArrayList<>(listOfActivities);
        cheap.removeIf(p -> p.annualCost >= 500);
        System.out.println("Cost is less than $500: \n" + cheap);














    }

}
