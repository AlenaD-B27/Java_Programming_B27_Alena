package day38_practice.pizza;

public class Albertos {
    public static void main(String[] args) {
        Pizza cheese = new Pizza("small", 0);
        System.out.println(cheese);

        Pizza peperoni = new Pizza ("medium", 1);
        System.out.println(peperoni.calculatePrice());
        System.out.println(peperoni.getToppingsNum());
        peperoni.setToppingsNum(-1);
        System.out.println(peperoni);


    }
}
