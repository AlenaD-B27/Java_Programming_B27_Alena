package GROUP_PRACTICE;

import java.util.Scanner;

public class ReplaceFirst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // String usersText = "Today and tomorrow is Thursday and is java. Tomorrow is java and is java and is java again day. Today is a beautiful day. Day after tomorrow is java again.";

        String usersText = input.nextLine();

        // replace space between is and java only


        System.out.println("enter where you want to replace the space");
        String s1 = input.nextLine();

        String replaceS1 = s1.replace(" ", "");


        while(usersText.contains(s1)){
            usersText = usersText.replace(s1, replaceS1);
        }

        System.out.println(usersText);

    }
}
