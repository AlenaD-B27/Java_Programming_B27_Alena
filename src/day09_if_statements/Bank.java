package day09_if_statements;

public class Bank {
    public static void main(String[] args) {
        double balance = 1_000_000;
        double amountToWithdraw = 1_500_000;

        balance -= amountToWithdraw;
        System.out.println("Withdrew: " + amountToWithdraw);

        if(balance >= 0){
            System.out.println("Account balance is: " + balance);
        }

        if(balance < 0){
            System.out.println("Overdraft penalty:");
            System.out.println("Amount due: " + amountToWithdraw * 0.25);
        }



    }
}
