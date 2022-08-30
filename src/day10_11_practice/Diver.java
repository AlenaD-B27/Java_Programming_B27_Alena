package day10_11_practice;

import java.util.Scanner;

public class Diver {
    public static void main(String[] args) {

//        create a class Diver
////
////You are diving in the ocean. Your oxygen tank has a certain level (number)
////
////        declare and assign a int variable about the oxygen level in the tank and print a message based on the oxygen level:
////
////        Above 90 - Your tank is full
////        Above 80 - Still okay
////        Above 70 - Don't go too far
////        Above 60 - Start to head back
////        Above 50 - Be careful now you at at 50%
////
////                -----------------------------------------------------------
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lvl of O2 in tank:");
        int o2lvl = input.nextInt();

        if(o2lvl >= 90){
            System.out.println("Your tank is full");
        }else if(o2lvl >= 80){
            System.out.println("Still okay");
        }else if(o2lvl >= 70){
            System.out.println("Don't go too far");
        }else if(o2lvl >= 60){
            System.out.println("Start to head back");
        }else if(o2lvl >= 50){
            System.out.println("Be careful now at 50%");
        }else{
            System.out.println("LOW!");
        }













    }
}
