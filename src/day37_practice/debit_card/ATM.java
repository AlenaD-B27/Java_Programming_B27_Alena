package day37_practice.debit_card;

import static my_utils.StringUtil.fixFormat;

public class ATM {
    public static void main(String[] args) {

        DebitCard card1 = new DebitCard(234, "Alena Darazhei", 123);


        System.out.println("Card 1 info: " + card1);
        System.out.println("-----------------");

        DebitCard card2 = new DebitCard (123456789090L, "Feruz Urazaliev", "Visa", 123, 124.6 );

        System.out.println("Card 2 info: " + card2);
        System.out.println("-------------------");

        DebitCard card3 = new DebitCard (1111222233334444L, "James Bond", "SecretType", 0007, 1_000_000_000);

        System.out.println("Card 3 info: " + card3);

        System.out.println("-------------------");

        DebitCard card4 = new DebitCard(9999777733331111L, "John Smith", "mastercard", 9999, 1000);

        System.out.println("Card 4 info: " + card4);
        System.out.println(fixFormat(card4.cardType));

        System.out.println("-------------------");















    }
}
