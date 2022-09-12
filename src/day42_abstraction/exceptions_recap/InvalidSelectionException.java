package day42_abstraction.exceptions_recap;

public class InvalidSelectionException extends Exception{ // making it a subclass of Exception class makes it checked exception;

    public InvalidSelectionException(){
        super("Selection can only be 1, 2 or 3");
    }




}
