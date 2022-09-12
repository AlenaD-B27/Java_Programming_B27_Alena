package day42_practice.exception;

public class Runner {
    public static void main(String[] args) throws FailToCheckOutException {




            Library.borrow(true);


        try {
            Library.getLibraryCard("Chicago");
        } catch(NonResidentException e){
            System.out.println(e.getMessage());
        }

        Library.getLibraryCard("Fairfax");







    }
}
