package day22_array;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {

        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println("type in the number of the month");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num > 0 && num < 13){
            System.out.println(months[num-1]);
        } else {
            System.out.println("invalid number");
        }














    }
}
