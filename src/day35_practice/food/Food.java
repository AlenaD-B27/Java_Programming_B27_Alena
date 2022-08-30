package day35_practice.food;

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
//            - create a constructor that creates a Food object with the name, quantity, and unit price
//                -> call calculatePrice() method here

    public Food (String name, int quantity, double unitPrice){
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        calculatePrice();
    }
//        - method:
//
//            - calculatePrice(): multiple the quantity by unit price and assign the value to the total price

    public void calculatePrice(){
        totalPrice = quantity * unitPrice;
    }
//            - toString()


    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + totalPrice +
                '}';
    }


//    print all the Food information
//
//    Create a separate class to create and test the Food objects
}
