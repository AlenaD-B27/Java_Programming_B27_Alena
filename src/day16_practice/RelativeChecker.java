package day16_practice;

import java.util.Scanner;

public class RelativeChecker {
    public static void main(String[] args) {

//        [Relative checker]
//
//        Given two full names check if the two people are related. They will be considered to be related if they have the same last name
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First and Last name:");
        String name1 = input.nextLine();
        System.out.println("Enter First and Last name:");
        String name2 = input.nextLine();

        int whereSpace1 = name1.indexOf(" ");
        name1 = new String(name1.substring(whereSpace1 + 1));
        int whereSpace2 = name2.indexOf(" ");
        name2 = new String(name2.substring(whereSpace2 + 1));

        boolean isRelated = name1.equalsIgnoreCase(name2);

        if(isRelated){
            System.out.println("Related");
        }else{
            System.out.println("Not Related");
        }


//
//        Input:
//        James Bond
//        Jamie Bond
//        Output:
//        Related















    }
}
