package day40_practice.device;

public class TV extends Device{

    public TV(String brand, String model, double price, boolean wireless) {
        super(brand, model, price, wireless);
    }

    @Override
    public String toString() {
        return super.toString() + ", TV.";
    }

    @Override
    public void useDevice() {
        super.useDevice();
    }
}
