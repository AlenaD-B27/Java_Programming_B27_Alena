package day16_practice;

public class MoveFirstWord {
    public static void main(String[] args) {
//      [Move first word]
//        Given a sentence. Display the sentence with the first word moved to the end of the sentence.
        String s = new String("Java is a fun language");
        int whereSpace1 = s.indexOf(" ");
        String s1 = s.substring(0,whereSpace1);
        String s2 = s.substring(whereSpace1);
        String s3 = s2 +" "+ s1;
        System.out.println("s3 = " + s3);

//
//        Input:
//        Java is a fun language
//        Output:
//        is a fun language Java













    }
}
