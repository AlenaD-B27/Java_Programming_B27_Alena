package day11_nested;

import java.util.Scanner;
//        Write a program that will read a number from the user. This number will be a year. Use that given year to figure out if there was a pandemic in that year, and if there was which one.
//
//        Data to use:
//        1346-1353: The Black Death
//        1665-1666: Great Plague of London
//        1770-1772: Russian plague
//        1889-1890: Flu pandemic
//        1916: American polio epidemic
//        1918-1920: Spanish Flu
//        2009-2010: H1N1 Swine Flu pandemic
//        2014-2016: West African Ebola epidemic
//        2020-2021: COVID-19
//        Any year not in those ranges: No Pandemic
//
//        -----------------------------------------------------------

public class PandemicChecker {
    public static void main(String[] args) {

       Scanner input = new Scanner (System.in);

        System.out.println("What year would you like to check?");
        int year = input.nextInt();

        if(year >= 1346 && year <= 1353){
            System.out.println("The Black Death");
        }else if (year == 1665 || year == 1666){
            System.out.println("Great Plague of London");
        }else if (year >= 1770 && year <= 1772){
            System.out.println("Russian plague");
        }else if (year >= 1889 && year <= 1890) {
            System.out.println("Flu Pandemic");
            // it's obvious


        }else{
            System.out.println("No Pandemic");
        }















    }
}
