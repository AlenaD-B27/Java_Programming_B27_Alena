package day38_practice.amazon;

import day38_practice.amazon.AmazonAccount;

public class UseAmazon {
    public static void main(String[] args) {

        AmazonAccount account = new AmazonAccount("HelenSDor", "lenador.18@gmail.com", true);

        System.out.println(account.getUserName());
        account.setUserName("Feruz96");
        System.out.println(account.toString());









    }
}
