package day37_static;

public class Executions {
    public static void main(String[] args) {
        new Executions(); // quick way to call the constructor (creating an object).
        System.out.println(1);
        new Executions(); // calling the constructor again
    }

    public Executions(){
        System.out.println(2);
    }

    static {
        System.out.println(3);
    }

    // static has a priority, static block will be ran first (once) before anything else, always when the class is loaded(used). If it is multiple static blocks they all run first from top to bottom.
    // then it executes top to bottom in the main method.


}
