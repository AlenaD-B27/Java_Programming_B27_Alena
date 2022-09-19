package day45_polymophism.building;

public abstract class Building {

    String location;
    double price;

    public Building(String location, double price){
        this.location = location;
        this.price = price;
    }

    public abstract void pay();

    public String toString(){
        return "Location: " + location + ", price: " + price;
    }

    /*
    Create an abstract class Building

    create instance variables:
        String location
        double price

    create abstract methods:
        void pay()

    create a constructor to assign the location & price

    override the toString to print the location & price
     */
}
