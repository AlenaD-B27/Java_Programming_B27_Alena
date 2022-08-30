package day06_practice;

public class LeapYear {
    public static void main(String[] args) {

//        create a class LeapYear
//
//    declare and assign a year variable
//            check if the year is a leap year, a year will be a leap year if it is divisible by 4

int year = 2000;
boolean isLeap = year%4==0;
        System.out.println("isLeap = " + isLeap);
--year;
        isLeap = year%4==0;
        System.out.println("isLeap = " + isLeap);









    }
}
