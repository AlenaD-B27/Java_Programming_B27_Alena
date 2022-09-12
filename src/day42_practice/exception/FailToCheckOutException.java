package day42_practice.exception;

public class FailToCheckOutException extends Exception{
    public FailToCheckOutException(){
        super("Didn't check out");
    }
}
