package day09_practice;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
//        create a sales amount variable
//        use the sales amount to determine the bonus you get at end of the month
//
//        if your sales amount is less than 10000 you don't get any bonus
//
//        if your sales amount is more than or equal to 10000 and less than 15000 you get a bonus of 5000
//
//        if your sales amount is more than or equal to 15000 you get a bonus of 7000
//
//        print your bonus number
//
//        ________________________________________________________________________

       Scanner input = new Scanner(System.in);
        System.out.println("What's your sales?");
       double sales = input.nextDouble();
       boolean noBonus = sales < 10_000;
       boolean bonus5K = sales >= 10_000 && sales < 15_000;
       boolean bonus7K = sales >= 15_000;

       if(noBonus) {
           System.out.println("No bonus, loser");
       }
       if(bonus5K){
           System.out.println("$5.000 bonus, you can do better");
       }
       if(bonus7K){
           System.out.println("$7.000 bonus, you are a Superstar");
       }











    }
}
