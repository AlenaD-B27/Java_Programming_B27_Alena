package day43_abstraction.learning;

public class AppStore {
    public static void main(String[] args) {

        System.out.println(Mac.brand);
        System.out.println(Mac.os);
        Mac.getBrand();

        Desktop obj = new Desktop();
        obj.turnOn();
        obj.typing();
        // obj.getBrand(); // can not access the static members of the classes because static is not inherited











    }
}
