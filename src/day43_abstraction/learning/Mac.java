package day43_abstraction.learning;

public interface Mac {

    public static final String brand = "Apple"; // p s f the keywords which are here by default, so they are not needed
    String os = "IOS";

    void turnOn(); // public abstract void turnOn();

    public static void getBrand(){ // public is grey because everything is public by default
        System.out.println("The brand is Apple");
    }

   public default void typing(){ // default allows us to create a method with implementation in the interface. It is NOT the default access modifier. This is a instance method for the class that implements. Because static can not be inherited.
       System.out.println("Typing on apple keyboard");
   };


}
