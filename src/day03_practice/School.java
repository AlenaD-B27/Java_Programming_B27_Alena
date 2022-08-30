package day03_practice;

import java.sql.SQLOutput;

public class School {
    public static void main(String[] args) {
        /*
        declare and assign all these variables:
    (all int) grade1, grade2, grade3, grade4, grade5

    assign the number of students in each grade

    extra: try to create another variable to find the total number of students in the whole school

    (all double) average gpa, number of school days, number of snow days
         */

        int grade1 = 30;
        int grade2 = 40;
        int grade3 = 20;
        int grade4 = 18;
        int grade5 = 22;
        int totalStudents = grade1 + grade2 + grade3 + grade4 + grade5;
//        System.out.println("totalStudents = " + totalStudents);
        double gpa1 = 39.9;
        double gpa2 = 32.12;
        double gpa3 = 33.8;
        double gpa4 = 40.55;
        double gpa5 = 38.6;
        double avgGPA = (gpa1 + gpa2 + gpa3 + gpa4 + gpa5)/5;
//        System.out.println("Average gpa = "+avgGPA);

        //======================================================================================
        //Here's me just playing:
        

        int nmbOfWeeks = 23;
        int daysInWeek = 7;
        int schlDays = nmbOfWeeks*daysInWeek;
        int daysInYear = 365;
        int nmbOfSeasons = 4;
        int snowDays = daysInYear/nmbOfSeasons;



        System.out.println(totalStudents+" is going to this school. Average gpa is "+avgGPA + ".\n");
        System.out.println("I will graduate CYDEO after "+ schlDays+" days, but ");
        schlDays = 23*(daysInWeek-3);
        System.out.println("in reality it will be just "+schlDays + " because Wednesdays and weekends are technically our days off.\n");


        String city = "Chicago";
        System.out.println("Also this year in "+city+ " we will have "+snowDays+" snow days, because "+city+ " has "+nmbOfSeasons+ " seasons. And the year has "+daysInYear+" days which means you need to divide "+daysInYear+" by "+nmbOfSeasons+" :)\n");

        String city1 = "Miami";
        boolean no = false;
        boolean yes = true;
        nmbOfSeasons = 2;
        snowDays = daysInYear/nmbOfSeasons;


        System.out.println("Maimi has just "+nmbOfSeasons+" seasons. Does it mean that they have "+snowDays+" snow days? ====> ");
        System.out.println("no = " + no);










    }
}
