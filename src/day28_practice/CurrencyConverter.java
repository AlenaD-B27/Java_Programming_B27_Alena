package day28_practice;

import java.util.Scanner;

public class CurrencyConverter {
    /*
    Currency Converter

create a method that will accept a currency type(String) and a currency amount (double)[as dollars] and convert the currency from dollars to a different type

Use the following information to convert from given dollars to the desired currency type

1 dollar = 0.91 euro
1 dollar = 121.03 yen
1 dollar = 14.85 lira
1 dollar = 1,217.52 won
1 dollar = 181.45 rupee

Note: Don't worry about decimal formats, focus on method

Ex:
	Input:
		euro, 100

	Output:
		91

Ex:
	Input:
		yen, 50

	Output:
		6051.5
     */
    public static void main(String[] args) {
Scanner input = new Scanner (System.in);
        System.out.println("enter amount:");
        System.out.println("Result:");
        System.out.println("$" + convert(input.nextDouble()));




    }
    public static boolean validCurrency(String str){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter currency:");
        str = input.next().trim().toLowerCase();

        if (str.equals("euro") || str.equals("yen")|| str.equals("lira")|| str.equals("won")|| str.equals("rupee")){
            return true;
        } else {
            System.out.println("Invalid currency");
            return false;
        }
    }
    /*
    1 dollar = 0.91 euro
1 dollar = 121.03 yen
1 dollar = 14.85 lira
1 dollar = 1,217.52 won
1 dollar = 181.45 rupee
     */
    public static double convert (double howMuch){
       double $1 =  0;
       double $value;

        if(validCurrency("euro")){
            $1 = .91;
       }else if(validCurrency("yen")){
             $1 = 121.03;
       }else if(validCurrency("lira")){
             $1 = 14.85;
       }else if(validCurrency("won")){
             $1 = 1_217.52;
       } else if (validCurrency("rupee")) {
             $1 = 181.45;
       }


        $value = $1*howMuch;
        return $value;


    }









}
