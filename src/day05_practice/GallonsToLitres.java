package day05_practice;

public class GallonsToLitres {
    public static void main(String[] args) {

//        create a class called GalonsToLiters, and write a program that can convert the gallons to litters
//                Ex:
//        gallon = 10;
//        output:
//        10 gallons equal to 37.8541 liters
//                gallon = 20
//        output:
//        20 gallons equal to 75.7082 liters

        double gal = 1;

        double l = 4.54609;

        gal=10;
        double result = gal*l;
        System.out.println(gal+" gallons=" + result+"liters");
        gal=20;
        result = gal*l;
        System.out.println(gal+" gallons=" + result+"liters");







    }
}
