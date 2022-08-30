package day37_static.phone;

public class IPhone {

    // instance variables, copy for EACH object.
    String model;
    String color;
    double price;
    int storage;


    // static variables are sharable for the Class: sharable for all objects.
    static String os;
    static String brand;

    // static block used to initialize static variables.
    static{
        System.out.println("STATIC BLOCK RUN");
        os = "IOS";
        brand = "Apple";
    }

    // Constructor used to initialize instance variables.
    public IPhone(String model, String color, double price, int storage) {
        System.out.println("CONSTRUCTOR RUN");
        this.model = model;
        this.color = color;
        this.price = price;
        this.storage = storage;
    }

     /*
        Difference between static block & constructor:

         - static block will run once, the first time the class is used
            -> we can write any code we want

         - constructor will be called every time an object is made
     */

    @Override
    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", storage=" + storage +
                '}';
    }
}
