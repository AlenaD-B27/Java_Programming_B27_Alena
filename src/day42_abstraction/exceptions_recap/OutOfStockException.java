package day42_abstraction.exceptions_recap;

public class OutOfStockException extends RuntimeException { // 1. by making it a child of RuntimeException we create an unchecked exception;

    public OutOfStockException(){ // 2. Constructor
     //   super(); // calling the parent constructor with no arguments, it is optional because the rule is it's already called in child constructor;
        super("Item is out of stock"); // 3. Calling the parent constructor with one String argument helps us to define the message of the exception;

    }

}
