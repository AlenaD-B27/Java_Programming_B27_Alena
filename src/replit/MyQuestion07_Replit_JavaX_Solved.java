package replit;

import java.util.Scanner;

public class MyQuestion07_Replit_JavaX_Solved {
    public static void main(String[] args) {


        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE HERE


        if (word.lastIndexOf('x') == word.length()-1 || word.lastIndexOf('X') == word.length()-1){
            word = word.substring(0,word.length()-1);
        }

        if(word.substring(0,1).equals("x") || word.substring(0,1).equals("X")){
            word = word.substring(1);

        }

        System.out.println(word);















    }
}
