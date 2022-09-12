package day42_practice.cars;

public class Tesla extends ElectricCar{
    @Override
    public void start() {
        System.out.println("key card near by, starting car");
    }

    @Override
    public void charge() {
        System.out.println("at tesla charging station");

    }
}
