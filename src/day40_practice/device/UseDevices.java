package day40_practice.device;

public class UseDevices {
    public static void main(String[] args) {


        TV Samsung1 = new TV ("Samsung", "1200R", 3000.99, false );
        Phone Iphone5 = new Phone("Apple", "5", 520, true);

        System.out.println(Samsung1);
        System.out.println(Iphone5);
        Samsung1.useDevice();
        Iphone5.useDevice();










    }
}
