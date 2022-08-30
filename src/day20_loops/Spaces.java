package day20_loops;

public class Spaces {
    public static void main(String[] args) {

        String s = "hello world";
        String result = "";


        for( int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);

            if(letter == ' '){
                result += "_ ";
            } else {
                result += letter + " ";
            }

        }

        System.out.println(result.trim());

















    }
}
