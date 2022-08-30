package day18_loops;
import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        int validPin = 1234;
        int userPin;
        int attempts = 0;
        Scanner input = new Scanner(System.in);
        // purpose of this loop was to allow reattempts logic
        do{
            System.out.println("Enter your pin");
            userPin = input.nextInt();
            attempts++;

        }while (attempts < 3 && userPin != validPin);

        if(attempts <= 3 && userPin == validPin){
            System.out.println("logged in");
        } else {
            System.out.println("Locked account, too many attempts");
        }









    }
}
