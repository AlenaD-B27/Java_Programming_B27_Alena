package MY_QUESTIONS;

public class Unit2_Assessment_Question16_Solved {
    public static void main(String[] args) {


        String s = "I will find the lost book";
        String word = "Reverse ";

        for (int index = s.length() - 1; index <= 0; index--){  // it should be index >= 0
            word += s.charAt(index);
        }

        System.out.println(word);











    }
}
