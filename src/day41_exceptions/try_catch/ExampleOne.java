package day41_exceptions.try_catch;

public class ExampleOne {
    public static void main(String[] args) {

        String s = null;
        // System.out.println(s.length()); this would cause a NullPointerException - during runtime

        s = "hello";
//        System.out.println(s.charAt(10)); this would cause a StringIndexOutOfBoundsException - during runtime

        System.out.println("Hello");

        //Thread.sleep(5000); the method has some possible checked exception, so we need to handle it before we can compile - checked - compile time
    }
}
