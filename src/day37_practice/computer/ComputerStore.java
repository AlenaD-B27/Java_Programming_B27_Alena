package day37_practice.computer;

public class ComputerStore {
    public static void main(String[] args) {
        Computer lenaTron = new Computer(5000, "AlenaSoft", "Red");

        System.out.println(lenaTron.brand);
        System.out.println(lenaTron.color);
        System.out.println(lenaTron.price);

        System.out.println(Computer.hasBattery);
        System.out.println(Computer.hasMemory);
        System.out.println(Computer.hasScreen);



    }
}
