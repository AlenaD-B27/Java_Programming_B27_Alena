package day12_practice;



import java.util.Scanner;

public class Genre {
//    public static void main(String[] args) {
//
//        Data based on genre:
//        genre - Fantasy
//        page length - 500
//        profit - 1,000,000
//        sequels - 5
//        countries - 50
//        genre - Detective
//        page length - 350
//        profit - 700,000
//        sequels - 3
//        countries - 45
//        genre - Science Fiction
//        page length - 720
//        profit - 900,500
//        sequels - 4
//        countries - 30
//        genre - Short Story
//        page length - 150
//        profit - 300,000
//        sequels - 1
//        countries - 40
//                -----------------------------------------------------------
//
public static void main(String[] args) {
 int pageLength, profit,sequels, countries;
 Scanner input = new Scanner(System.in);
 System.out.println("What genre?");
 String genre = input.next();

 switch (genre){
  case "Fantasy":
   pageLength = 500;
   profit = 1_000_000;
   sequels = 5;
   countries = 50;
   System.out.println("pageLength = " + pageLength);
   System.out.println("profit = " + profit);
   System.out.println("sequels = " + sequels);
   System.out.println("countries = " + countries);
   break;
  case "Detective":
   pageLength = 350;
   profit = 700_000;
   sequels = 3;
   countries = 45;
   System.out.println("pageLength = " + pageLength);
   System.out.println("profit = " + profit);
   System.out.println("sequels = " + sequels);
   System.out.println("countries = " + countries);
   break;
  case "Science Fiction":
   pageLength = 720;
   profit = 900_500;
   sequels = 4;
   countries = 30;
   System.out.println("pageLength = " + pageLength);
   System.out.println("profit = " + profit);
   System.out.println("sequels = " + sequels);
   System.out.println("countries = " + countries);
   break;
  case "Short Story":
   pageLength = 150;
   profit = 300_000;
   sequels = 1;
   countries = 40;
   System.out.println("pageLength = " + pageLength);
   System.out.println("profit = " + profit);
   System.out.println("sequels = " + sequels);
   System.out.println("countries = " + countries);



 }












 }
}
