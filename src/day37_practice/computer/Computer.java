package day37_practice.computer;

public class Computer {
//    Computer - static
//    class name: computer:
//    instance variables:
//    price, brand, color, ...

    double price;
    String brand;
    String color;

    public Computer(double price, String brand, String color) {
        this.price = price;
        this.brand = brand;
        this.color = color;
    }

    //    static variables: hasScreen, hasBattery, hasMemory

    static boolean hasScreen;
    static boolean hasBattery;
    static boolean hasMemory;

    static {
        hasScreen = true;
        hasBattery = true;
        hasMemory = true;
    }


//    make objects of the class in a main method and access both instance and static members from proper references

}
