package day24_array;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Today is Friday. Have a good weekend!";

        String [] words = str.split(" ");
        String reverse = "";

        for (String eachWord : words) {
            String eachReverse = "";
            for (int i = eachWord.length()-1; i >=0 ; i--) {
                eachReverse += eachWord.charAt(i);
            }

            reverse += eachReverse + " ";
        }

        System.out.println(reverse);
















    }
}
