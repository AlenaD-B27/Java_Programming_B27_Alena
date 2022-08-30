package replit;

import java.util.Scanner;

public class MyQuestion09_Replit_CatsAndDogs_Solved {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW
        int countDogs = 0;
        int countCats = 0;

        while ( str.contains("dog") || str.contains("cat")){


                if(str.contains("dog")){
                    countDogs++;
                    str = str.replaceFirst("dog", "");

                }else{
                    countCats++;
                    str = str.replaceFirst("cat", "");









            }
        }

        boolean solution = countCats == countDogs ? true : false;
        System.out.println(solution);





    }
}
