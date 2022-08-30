package day15_string;

public class CharAtMethod {
    public static void main(String[] args) {

     String s = "java";
     //          0123
        System.out.println("First char " + s.charAt(0));
        System.out.println("Second char " + s.charAt(1));
        System.out.println("Third char " + s.charAt(2));
        System.out.println("Fourth char " + s.charAt(3));
       // System.out.println("Invalid char " + s.charAt(100)); // will give you error


        System.out.println("Length " + s.length());
        System.out.println("Last index " + (s.length()-1)); // returns int
        System.out.println("Last index " + s.charAt(s.length()-1)); // returns char


        // reverse my String: goal is to se avaj
        // hardcoded:
        System.out.print(s.charAt(3));
        System.out.print(s.charAt(2));
        System.out.print(s.charAt(1));
        System.out.println(s.charAt(0));

        System.out.println("" + s.charAt(3) + s.charAt(2) + s.charAt(1) + s.charAt(0)); // we are using "" + because chars will not concatenate, they will actually sum.
        











    }
}
