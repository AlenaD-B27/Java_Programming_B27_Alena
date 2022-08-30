package MY_QUESTIONS;

public class Unit2_Assessment_Question27 {
    public static void main(String[] args) {

        String [] words = {"one", "two", "three", "four"};
        String [] other = new String[words.length];
        int index = 0;

        for (String word : words){
            other[index++] = word + word.length();
        }
        System.out.println(other); // it needs to be Array.toString(other)
    }
}
