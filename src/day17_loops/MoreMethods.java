package day17_loops;

public class MoreMethods {
    public static void main(String[] args) {
        // isEmpty()

        String s = "hello";
        System.out.println(s.isEmpty());

        String s2 = " "; // space char
        System.out.println(s2.isEmpty());

        String s3 = ""; // empty space, String but no characters
        System.out.println(s3.isEmpty());

        // isBlank()

        String a = "    "; // spaces are characters
        System.out.println(a.isEmpty()); // checks if there is characters
        System.out.println(a.isBlank()); // checks for non space characters

        String b = "h      ";
        System.out.println(b.isEmpty());
        System.out.println(b.isBlank());

        String c = "";
        System.out.println(c.isEmpty());
        System.out.println(c.isBlank());

        // replace
        String str = "java";
        str = str.replace('a', 'z');
        System.out.println(str);

        String str2 = "an apple path";
        System.out.println(str2.replace("a", "(a)"));

        // common use case: delete spaces
        String str3 = "   multiple words here  ";
        System.out.println(str3.trim());
        str3 = str3.replace(" ", "");
        System.out.println(str3);

        // replacing only first
        String z = "wooden spoon";
        System.out.println(z.replace("o", "-"));
        System.out.println(z.replaceFirst("o", "-"));

        // how to replace middle character only

        String ex = "wooden spoon";
        int firstO = ex.indexOf('o');
        int secondO = ex.indexOf('o', firstO + 1);
        System.out.println(ex.substring(0, secondO));
        System.out.println(ex.substring(secondO).replaceFirst("o", "-"));
        System.out.println(ex.substring(0, secondO) + ex.substring(secondO).replaceFirst("o", "-"));

    }
}
