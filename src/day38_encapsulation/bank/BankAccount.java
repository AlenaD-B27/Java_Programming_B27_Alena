package day38_encapsulation.bank;

public class BankAccount {

    // this file will be read-only

    private long accountNumber;
    private double balance;

    public BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // there's no setters methods, so you can never change the values.
}
