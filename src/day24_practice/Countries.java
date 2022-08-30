package day24_practice;

import java.util.Arrays;

public class Countries {
    public static void main(String[] args) {

//       Given a String array:

       String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Portugal", "Philippines", "Armenia",  "Colombia", "Honduras", "Indonesia", "United States"};

//Find and print all the first and last characters
        for(String eachCountry : countries){
                System.out.println("" + eachCountry.charAt(0) + eachCountry.charAt(eachCountry.length() - 1));
        }
        System.out.println("=======================================================");
//Find and print all the middle character
        for(String eachCountry : countries){
            if(eachCountry.length() % 2 == 0){
                System.out.println("" + eachCountry.charAt(eachCountry.length()/2 -1) + eachCountry.charAt(eachCountry.length()/2));
            }else{
                System.out.println(eachCountry.charAt(eachCountry.length()/2));
            }
        }
        System.out.println("==============================================================");
//Print each country as a char array
        for(String eachCountry : countries){
            System.out.println(Arrays.toString(eachCountry.toCharArray()));
        }









    }
}
