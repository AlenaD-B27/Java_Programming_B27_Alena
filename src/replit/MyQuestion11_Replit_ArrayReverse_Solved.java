package replit;

import java.util.Arrays;
import java.util.Scanner;

public class MyQuestion11_Replit_ArrayReverse_Solved {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++){
            arr[i] = input.nextLine();
        }

        //WRITE YOUR CODES BELOW:

        String[] reverse = new String[arr.length];


        for(int j = 0; j < arr.length; j++){ // j - word index in reverse
            reverse[j] = arr[arr.length-1-j];

        }

        System.out.println(Arrays.toString(reverse));
    }
}
