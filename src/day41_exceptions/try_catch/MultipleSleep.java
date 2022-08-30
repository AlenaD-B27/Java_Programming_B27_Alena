package day41_exceptions.try_catch;

public class MultipleSleep {
    public static void main(String[] args) throws InterruptedException { //accepting if the exception happens stop my program
        System.out.println("Hello");

        Thread.sleep(3000);

        System.out.println("Second line");

        Thread.sleep(-3000);

        System.out.println("Middle line");

        Thread.sleep(3000);

        System.out.println("Bye");
    }
}
