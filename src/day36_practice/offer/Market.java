package day36_practice.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Market {
    public static void main(String[] args) {
        //            create multiple Offer objects and store them into an ArrayList of Offers.

        Offer[] offerArr = new Offer [5];
        offerArr[0] = new Offer("Apple, SDET", "Los Angeles, CA", 160_000, true, 4);
        offerArr[1] = new Offer("Microsoft, QA", "Silicone Valley, CA", 140_000, true, 3);
        offerArr[2] = new Offer("Bulldog Ale House, server", "Roselle, IL", 40_000, false, 2);
        offerArr[3] = new Offer("Lettuce Entertain, bartender", "Chicago, IL", 70_000, true, 2);
        offerArr[4] = new Offer("Target, cashier", "Des Plains, IL", 20_000, false, 1);

        ArrayList<Offer> offerList = new ArrayList<>(Arrays.asList(offerArr));




        //            Create multiple other Lists to filter out different information:

//    write a program that can only keep the offers from local area

        ArrayList<Offer> local = new ArrayList<>();
        for (Offer eachOffer : offerList){
            if(eachOffer.location.endsWith("IL")){
                local.add(eachOffer);
            }
        }
        System.out.println("Local:\n" + local);

//    write a program that can remove all offers that are not for SDET or QA
        ArrayList<Offer> forTester = new ArrayList<>();
        for (Offer eachOffer : offerList){
            if(eachOffer.company.endsWith("QA") || eachOffer.company.endsWith("SDET")){
                forTester.add(eachOffer);
            }
        }
        System.out.println("For QA/SDET:\n" + forTester);

//    write a program that can remove the offers that are not full Time

        ArrayList<Offer> fullTime = new ArrayList<>(offerList);
            fullTime.removeIf(p -> p.isFullTime == false);
        System.out.println("Full time:\n" + fullTime);

//    write a program that removes all offer that are less than 100,000 salary

        ArrayList<Offer> goodPay = new ArrayList<>(offerList);
        goodPay.removeIf(p -> p.salary < 100_000);
        System.out.println("Salary is 100.000 and up:\n" + goodPay);
//        - Find the biggest and lowest salary Offers and print the whole object

        ArrayList<Double> salaries = new ArrayList<>();
        for (Offer eachOffer : offerList){
            salaries.add(eachOffer.salary);
        }

        for(int i = 0; i < offerList.size(); i++) {
            if (offerList.get(i).salary == Collections.max(salaries))
                System.out.println("Biggest salary:\n" + offerList.get(i));
            if (offerList.get(i).salary == Collections.min(salaries))
                System.out.println("Smallest salary:\n" + offerList.get(i));
        }










    }
}
