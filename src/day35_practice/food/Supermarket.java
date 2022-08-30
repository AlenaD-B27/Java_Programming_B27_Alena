package day35_practice.food;

public class Supermarket {
    public static void main(String[] args) {

        Food apple = new Food("apple", 5, 0.22);

        System.out.println(apple);

        Food banana = new Food ("banana", apple.quantity*5, apple.unitPrice+0.8);

        System.out.println(banana);












    }
}
