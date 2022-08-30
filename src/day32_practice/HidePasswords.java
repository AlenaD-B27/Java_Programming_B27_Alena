package day32_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HidePasswords {
    /*
    Given an ArrayList of passwords (String). Hide each password in a star (*) format where each character is a star and print the ArrayList of hidden passwords
Ex:
Input:
{"one", "hi", "hold}

Output:
[ ***, **, **** ]
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter password1");
        String pass1 = input.nextLine();
        System.out.println("Enter password2");
        String pass2 = input.nextLine();
        System.out.println("Enter password3");
        String pass3 = input.nextLine();

        String [] passwordCollection = new String []{pass1, pass2, pass3};

        ArrayList<String> passwords = new ArrayList<>(Arrays.asList(passwordCollection));
        ArrayList<String> hiddenPasswords = new ArrayList<>(passwords.size());

        for (String eachPass: passwords){
            String stars = "";

            for (int i = 0; i < eachPass.length(); i++){
                stars += "*";
            }

            hiddenPasswords.add(stars);

        }

        System.out.println(hiddenPasswords);

        System.out.println("===========different approach=============");

        /*
        String [] passwordCollection = new String []{pass1, pass2, pass3};
        ArrayList<String> passwords = new ArrayList<>(Arrays.asList(passwordCollection));
         */

        for (int i = 0; i < passwords.size(); i++){
            passwords.set(i, starReplacement(passwords.get(i)));
        }
        System.out.println(passwords);

    }

    public static String starReplacement (String str){

        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            str = str.replace(str.charAt(i), '*');
        }
        return str;
    }
}
