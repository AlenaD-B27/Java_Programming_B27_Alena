package day20_loops;

public class CountHi {
    public static void main(String[] args) {


        //counting how many times hi is in the String
        String s = "abhicdhelhilofrhiidayhi";

        // approach 1: while loop and delete the first occurrence each time
        int count = 0;

        while(s.contains("hi")){
            count++;
            s = s.replaceFirst("hi", ""); // replaces the first occurrence
        }
        System.out.println(count);







    }
}
