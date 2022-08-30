package day41_exceptions.bank;

public class Runner {
    public static void main(String[] args) {

        Bank obj = new Bank();
        obj.balance = 3000;

        obj.withdraw(2000);
        System.out.println(obj.balance);

        obj.withdraw(2000);






    }
}
