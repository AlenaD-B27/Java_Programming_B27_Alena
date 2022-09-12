package day42_practice.exception;

import day42_abstraction.exceptions_recap.OutOfStockException;

public class Library {


    public static void getLibraryCard(String city) {
        if (city.equalsIgnoreCase("Fairfax") || city.equalsIgnoreCase("McLean")) {
            System.out.println("Library Card Created");
        } else {
            throw new NonResidentException();
        }
    }

    public static void borrow (boolean checkedOut) throws FailToCheckOutException{
        if (checkedOut == true){
            System.out.println("Enjoy reading");
        } else {
            throw new FailToCheckOutException();
        }
    }
}
