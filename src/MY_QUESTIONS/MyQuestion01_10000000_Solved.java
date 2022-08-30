package MY_QUESTIONS;

public class MyQuestion01_10000000_Solved {
    public static void main(String[] args) {
        double totalCost = 10_000_000.99; //and this is exactly what I want to print
        float sameNumber = 10000000.99f;
        System.out.println(totalCost); //prints as 1.000000099E7
        System.out.println(sameNumber);

        totalCost = 1_000_000.99; //the number I do NOT want, I want it to be printed with seven zeros.
        System.out.println("totalCost = " + totalCost);


/** ANSWER: int and double are primitive variables. For bigger than 8 bytes numbers you need more storage to compile it, you will learn how to use NON-primitive variables. (That's why the number on console has E7 at the end - this is the lead to what needs to be used but we didn't learn it yet. **/


    }

}
