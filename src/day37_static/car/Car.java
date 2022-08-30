package day37_static.car;

public class Car {

    String model;
    Driver driver;

    public Car (String model, String name, long licenceNumber, char licenceType){
        this.model = model;
        driver = new Driver (name, licenceNumber, licenceType);
    }

    public Car (String model, Driver driver){
        this.model = model;
        this.driver = driver;
    }
}
