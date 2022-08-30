package day37_practice.debit_card;

import  static my_utils.StringUtil.fixFormat;

public class DebitCard {

//    Debit card - custom classes + static
//
//    Create a class for Debit Card that has the following instance variables:
//    card number (long), holder name (String), card type (String), pin (int), and balance (double)

    long cardNumber;
    String holderName;
    String cardType;
    int pin;
    double balance;



//    static variables: account type (debit)
//            -> Use static block to initialize account type

    static String accountType;

    static {
        accountType = "debit";
    }

//    Create a constructor that will create a debit card object and initialize the card number, the card holder name, and the balance. The card number has to be 16 characters long to be a valid card number. If the length is too short or too big do not store the card number and print “Invalid card number”

    public DebitCard(long cardNumber, String holderName, double balance) {

        String strCardNum = String.valueOf(cardNumber);

        if (strCardNum.length() != 16){
            System.out.println("Invalid card number");
        }else{
            this.cardNumber = cardNumber;
        }
        this.holderName = holderName;
        this.balance = balance;
    }


//    Overload the constructor to take all of the instance variables. The card type must be either MasterCard or Visa to be valid card type. If it is not one of those two then do not store the type and print “invalid card type”. Also the pin must be only 4 characters long. If the pin is more than or less than 4 characters then do not store the pin into the instance variable and print “Invalid pin length”

    public DebitCard(long cardNumber, String holderName, String cardType, int pin, double balance) {
        this(cardNumber, holderName, balance);

        if(cardType.equalsIgnoreCase("Visa") || cardType.equalsIgnoreCase("MasterCard")){
            this.cardType = cardType;
        }else{
            System.out.println("Invalid card type");
        }

        String strPin = String.valueOf(pin);

        if(strPin.length() != 4){
            System.out.println("Invalid pin length");
        }else {
            this.pin = pin;
        }

    }


//    Add the toString method that will print all of the cards information (Except the pin). If the card type does not have a value do not print that line.



    @Override
    public String toString() {
        String output = "";
        if (pin == 0) {
            output = null;
        } else {
            if (cardNumber != 0) {
                output += "Card number: " + cardNumber + ", ";
            }

            if (cardType != null) {
                output += "Card type: " + fixFormat(cardType) + ", ";
            }

            output += "Holder Name: " + holderName + ", " +
                    "Balance: $" + balance + ".";

        }
        return output;
    }
}
