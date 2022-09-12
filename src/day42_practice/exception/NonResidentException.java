package day42_practice.exception;

public class NonResidentException extends RuntimeException{
    public NonResidentException(){
        super("Not a resident");
    }

}
