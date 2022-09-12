package day42_abstraction.exceptions_recap;

public class VendingMachine {

    public static String select(int selection){
        String item = "";
        if(selection == 1){
            item = "Chips";
        }else if (selection == 2){
   //         item = "Gum";   --> we assume it is oos;
            throw new OutOfStockException();// causes the exception to happen
        }else if (selection == 3){
            item = "Candy";
        }
        return item;
    }


    public static String selectValid(int selection) throws InvalidSelectionException{ // throws --> helps to pass the exception.
        String item = "";
        if(selection == 1){
            item = "Chips";
        }else if (selection == 2){
            item = "Gum";
        }else if (selection == 3){
            item = "Candy";
        }else {

            throw new InvalidSelectionException(); // checked exception MUST be handled, but also I am the one who created it so I do not want to handle it myself
        }
        return item;
    }








}
