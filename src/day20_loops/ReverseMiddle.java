package day20_loops;

public class ReverseMiddle {
    public static void main(String[] args) {
/*
Reverse only second word

Given a String with three words separated by spaces. Reverse only the second word and return the modified String
	Ex:
	I love java

	Output:
	I evol java
 */

        String str = "I love java";
        int start = str.indexOf(' ') + 1;
        int end = str.lastIndexOf(' ');

        String middleWord = str.substring(start,end);

        String reverseMiddle = "";
        for (int i = middleWord.length() - 1; i >= 0; i-- ){
            reverseMiddle += middleWord.charAt(i);
        }

        System.out.println(str.substring(0, start) + reverseMiddle + str.substring(end));









    }
}
