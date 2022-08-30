package day40_practice.device;

public class Phone extends Device {

    public Phone(String brand, String model, double price, boolean wireless) {
        super(brand, model, price, wireless);
    }

    @Override
    public String toString() {
        return super.toString() + ", Phone.";
    }

    @Override
    public void useDevice() {
        super.useDevice();
    }
}
