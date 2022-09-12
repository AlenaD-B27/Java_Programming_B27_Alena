package day43_abstraction.clothes;

public class Jackets extends Clothes implements HasHood{
    @Override
    public void wear() {
        System.out.println("Wearing the jacket");
    }

    @Override
    public void putOnHood() {
        System.out.println("Putting on jacket hood");
    }
}
