package day04_variables;

public class CellPhone {
    public static void main(String[] args) {

        String brand = "Apple";
        String model = "iPhone X";
        String color = "Rose Gold";
        double price = 1000.99;
        boolean hasCamera = true;
        int size = 128;
        char sim = 'A';

        System.out.println("Phone information:\nBrand: " + brand);
        System.out.println(model+" in "+color);
        System.out.println("With "+ size+" gb the price is $"+price);
        System.out.println("sim type: "+sim+" and has a camera: "+hasCamera);

//        ========================================================================
        //I wanna play here

//        String game = 'a';
        String gameIsOver = "a";
//        System.out.println("game = " + game);
        System.out.println(gameIsOver); //what was interesting for me if '' is for char only or if I can use it for a single character in String. So - '' is for char ONLY, String will use "" always.

//        ==========================================================================
//The class continues

        //alternative solution:
        String report = "Phone information:\nBrand: " + brand+"\n"+model+" in "+color + "\n"+ "With "+ size+" gb the price is $"+price+"\n"+"Sim type: "+sim+"; and has a camera: "+hasCamera;
        System.out.println(report);

//It's important to make any information as reusable as possible, so you do not have to copy&paste it 100 times.


    }
}
