package day04_practice;

public class Computer {
    public static void main(String[] args) {
//   create a class Computer
//create a main method
//
//    declare and assign these variables with the most appropriate datatypes:
//
//        brand, processor, ram memory, storage memory, has monitor, has wifi card, price, number of USB slots, has Bluetooth
//
//        create a summary of the information and print it. Be creative
        //========================================================================

        String brand = "Dell";
        String processor = "Intel Core";
        int ram = 8, storage = 128;
        boolean monitor = true, wifi = true;
        double price = 999.99;
        char usb = '4';
        boolean bluetooth = true;

        System.out.println(brand+" just came out with the new PC model which is ran on "+processor+ " processor.");
        System.out.println("Next characteristics are available: ");
        System.out.println("New device has "+ram+"GB ram memory + "+storage+"GB storage.");
        System.out.println("Is monitor available: "+ monitor);
        System.out.println("Are wifi and Bluetooth features available?");
        System.out.println("wifi = " + wifi);
        System.out.println("bluetooth = " + bluetooth);
        System.out.println("It also has "+usb+" available USB slots");
        System.out.println("You can buy it at any store just for $"+price+"!");




    }
}
