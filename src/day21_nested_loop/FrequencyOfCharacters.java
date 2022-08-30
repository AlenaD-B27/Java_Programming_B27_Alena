package day21_nested_loop;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        /*
        determine how many times each character is in the String
         */

        String str = "alenadarazhei";
        String checked = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;


            if(!checked.contains("" + str.charAt(i))){

            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){
                   count++;
                }
            }
            System.out.println(str.charAt(i) + " - " + count);
            checked += str.charAt(i);
            }
        }













    }
}
