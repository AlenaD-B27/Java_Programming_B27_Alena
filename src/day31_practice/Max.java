package day31_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
//        Create an ArrayList of Double elements
        ArrayList <Double> dbls = new ArrayList<>();
//        Fill the ArrayList with some values
        Scanner input = new Scanner(System.in);
        dbls.add(input.nextDouble());
        dbls.add(input.nextDouble());
        dbls.add(input.nextDouble());
        dbls.add(input.nextDouble());
        dbls.add(input.nextDouble());
//        Find the max element from the ArrayList

        Double max = dbls.get(0);

        for(Double eachDbl: dbls){
            if(max < eachDbl){
                max = eachDbl;
            }
        }

        System.out.println("Max element is " + max);



    }
}
