package day27_methods;

public class FirstMethod {

    public static void helloWorld(){
        System.out.println("Hello World!");
    }
    public static void helloWorld5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }

    public static void main(String[] args) {
        helloWorld();

        System.out.println();

        // print hello world 5 times
        for (int i = 0; i < 5; i++) {
          helloWorld();
        }

        // OR!!!
        helloWorld5Times();
    }





}
