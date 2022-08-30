package day26_practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DynamicGroups {
    public static void main(String[] args) {

        /*
        We did the group task together, try to make it completely dynamic with Scanner inputs. Ask the number of groups, the number of people in group1, group2, group3, etc... and ask for the name of each person on the group and assign into the array

-----------------------------------------------------------------------------------------------------------------------
         */


Scanner input = new Scanner (System.in);

        System.out.println("Input the number of groups:");
        int amountOfGroups = input.nextInt();
        input.nextLine();

        String cydeo [][] = new String [amountOfGroups][];

        for (int i = 0; i < amountOfGroups; i++) {
            for (int j = 0; j < cydeo[i].length; j++) {
                System.out.println("Input the name of the student: ");
                cydeo[i][j] = input.next();
            }
        }
        System.out.println(Arrays.deepToString(cydeo));

//                boolean tryAgain = true;
//
//                for (int i = 0; tryAgain; i++) {
//
//
//                    System.out.println("Add more students? Answer \"yes\" or \"no\" ");
//                    String reply = input.next();
//                    if (reply.equals("yes")) {
//                        tryAgain = false;
//                    } else if (reply.equals("no")) {
//                        tryAgain = false;
//                        break;
//                    } else {
//                        System.out.println("Invalid answer. Try again.");
//                    }
//                }

//
//            }
//        }

















    }
}
