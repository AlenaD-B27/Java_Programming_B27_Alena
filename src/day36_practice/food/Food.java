package day36_practice.food;

public class Food {
//    create a class called Food
//
//        - data:
//
//    name, quantity, unit price, total price

    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

//        - constructor
//
//            - create a constructor that creates a Food object with the name

    public Food(String name) {
        this.name = name;
    }


//            - create a constructor that creates a Food object with the name and quantity

    public Food(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

//            - create a constructor that creates a Food object with the name, quantity, and unit price
//            	-> call calculatePrice() method here

    public Food(String name, int quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        calculatePrice();
    }


//        - method:
//
//            - calculatePrice(): multiple the quantity by unit price and assign the value to the total price
 public void calculatePrice(){
        totalPrice = unitPrice*quantity;
 }
//            - toString()
//    print all the Food information

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + totalPrice +
                '}';
    }


//    Create a separate class to create and test the Food objects
//
//    	try making an array of Food objects
//    find all the Food objects that start with 'a' and print the whole information
//    find all the Food objects that have a total price over 20 and print the name of the food
}
