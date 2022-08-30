package day34_practice.car;

public class CarUse {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.fuelLevel = 63;
        car1.model = "AlenaCar";
        car1.color = "black";
        car1.year = 2022;

        System.out.println(car1);





            do {
                car1.drive();
            } while (!car1.isLow());
            System.out.println(car1.fuelLevel);
            car1.fillTank();












    }
}
