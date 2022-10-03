package day49_functional_interface.lambda_numbers;

public class UsingNumber {
    public static void main(String[] args) {


        // Lambda core syntax: Interface name = (parameters) -> {expressions};

        NumberInterface evenOrOdd = (n) -> {
            if(n % 2 == 0){
                System.out.println(n + " is even");
            } else {
                System.out.println(n + " is odd");
            }
        };

        // ternary example:

       NumberInterface evenOrOdd1 = (n) -> {
           System.out.println(n + (n % 2 == 0 ? " is even" : " is odd"));
       };

        evenOrOdd.test(5);
        evenOrOdd.test(-10);
        evenOrOdd.test(0);

        System.out.println("Ternary: ");
        evenOrOdd1.test(78);

        System.out.println("================================");

        NumberInterface cube = (n) -> {
            System.out.println(n*n*n);
        };

        // OR

     // NumberInterface cube1 = (n) -> {System.out.println(n*n*n)};
        NumberInterface cube1 = n -> System.out.println(n*n*n);
        // {} can be removed if just 1 line of expression (same as with if statement)
        // () can be removed if just 1 parameter



    }
}
