package day30_wrapper;

public class WrapperClassExample2 {
    public static void main(String[] args) {

        System.out.println("Byte min: " + Byte.MIN_VALUE);
        System.out.println("Byte max: " + Byte.MAX_VALUE);

        System.out.println("Integer min: " + Integer.MIN_VALUE);
        System.out.println("Integer max: " + Integer.MAX_VALUE);

        System.out.println(Character.isDigit('4'));
        System.out.println(Character.isLetter('o'));
        System.out.println(Character.isUpperCase('e')); // if(char >= 'A' && char <= 'Z')

        String s = "123";
        System.out.println(s + 5); // concatenation

        int i = Integer.parseInt(s); // converts String into int
        System.out.println(i + 5); // addition












    }
}
