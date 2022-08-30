package MY_QUESTIONS;

import java.util.Scanner;

public class MyQuestion05_NestedIfIntoTernary_Solved {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Choose what you would like to wear: 1) dress 2) Shirt and Shorts");
        int choice1 = input.nextInt();

        int color;
        if (choice1 == 1) {
            System.out.println("so classy! let's choose the color: 1) red 2) green 3) white");
            color = input.nextInt();
            if (color == 1) {
                System.out.println("red dress is gorgeous");
            } else if (color == 2) {
                System.out.println("green dress looks good with your eyes");
            } else if (color == 3) {
                System.out.println("for the white dress you need to buy different shoes");
            }

        } else if (choice1 == 2) {
            System.out.println("so casual!");
        }
//==========================================================================================



//String outfitChoice;
//        System.out.println(outfitChoice = choice1 == 2 ? "so casual!" : choice1 == 1 ? "so classy! let's choose the color: 1) red 2) green 3) white":"");
//              color = input.nextInt();
//       outfitChoice = color == 1 ? "red dress is gorgeous" : color == 2 ?  "green dress looks good with your eyes" : "for the white dress you need to buy different shoes";
//
//        System.out.println(outfitChoice);
//======================================================================================================

         // create a variable
    int n1 = 2, n2 = 9, n3 = -11;

    // nested ternary operator
    // to find the largest number


        int largest1;
        if (n1 >= n2) {
            if(n1 >= n3) {
                largest1 = n1;
            }else{
                largest1 = n3;          // nested
            }
        } else {
            if(n2 >= n3){
                largest1 = n2;
            }else{
                largest1 = n3;
            }
        }


        System.out.println("largest1 = " + largest1);
int a,b,c;
a = input.nextInt(); b = input.nextInt(); c = input.nextInt();
int greatest = (a >= b) ? ((a >= c) ? a : c) :  ((b >= c) ? b : c);
int greatestSolution = (a >= b) ? ((a >= c) ? a : c) : ((b >= c) ? b : c);



int greatestOneMoreTime = a >= b ? a >= c ? a : c : b >= c ? b : c;


      // So yes, nested ternary can exsist, BUT it's a headache and it is much easier just to use normal conditionals (if and else or switch).


    }





}
