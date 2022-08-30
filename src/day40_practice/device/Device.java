package day40_practice.device;

public class Device {
    String brand;
    String model;
    double price;
    boolean wireless;

    public Device(String brand, String model, double price, boolean wireless) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", wireless=" + wireless +
                '}';
    }

    public void useDevice(){
            System.out.println("Using " + brand + " " + model);
        }





}
