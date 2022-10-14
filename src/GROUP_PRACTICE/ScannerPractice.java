package GROUP_PRACTICE;

import java.util.Scanner; // import ALWAYS happens between the package and the Class.

public class ScannerPractice {
    public static void main(String[] args) {


        // Class is blueprint for Object

        Scanner input = new Scanner(System.in); // created the object. Object is something real, something we can use =====>>>> instance! Object is an instance of the Class.

        // instance - noun and can be adj.
        // train ticket == ticket to the train
        // instance variable == variable which describes the instance(object)
        // key lock == the lock made for this key
        // computer mouse == mouse for this computer
        // Class car, you can create Object(== instance) BMW, instance variables are: color, size, engine type...etc ===> all describe the Object.





        System.out.println("Input int:");

        input.nextInt();   //  ===> returns int type (in this example 5)
        // Scanner methods return the parameter.

        System.out.println("Input string value: ");

        input.nextLine(); // nextLine() method sometimes can have issues. If we already used Scanner methods in this code before AND now you want to use nextLine method you have to add extra nextLine();

        System.out.println(input.nextLine());

        System.out.println("Input string value: ");

        System.out.println(input.next()); // accepts the String, returns the String until you use space.


    }
}
