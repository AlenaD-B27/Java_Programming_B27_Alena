package day15_practice;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
      /*
      create a class AccountNumber
ask the user enter an account number and check if the account number is valid. Accounts are valid if:
handle empty inputs. If there is an empty input, do not check anything else and print: "Empty input given"

	- If the account number begins with a "2" the account number should be 7 characters long
		Print: "Valid 7-digit account number"
		Otherwise: "Invalid 7-digit account number"

	- If the account number begins with a "5" the account number should be 10 characters long
		Print: "Valid 5-digit account number"
		Otherwise: "Invalid 5-digit account number"

	— If the account number does not begin with a 2 or a 5 OR the account number lengths do not meet the expected results print “Invalid account number”
       */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the account number:");
        String accNum = input.next();
        // TODO

        if(accNum.isEmpty() == true){
            System.out.println("Empty input given");
        }else if(accNum.startsWith("2")){
            int lngth2 = accNum.length();
            if(lngth2 == 7){
                System.out.println("Valid 7-digit account number");
            }else{
                System.out.println("Invalid 7-digit account number");
            }
        }else if(accNum.startsWith("5")){
            int lngth5 = accNum.length();
            if(lngth5 == 5){
                System.out.println("Valid 5-digit account number");
            }else{
                System.out.println("invalid 5-digit account number");
            }
        }







    }
}
