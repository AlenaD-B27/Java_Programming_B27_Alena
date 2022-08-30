package replit;

import java.util.Scanner;

public class CountDuplicates {
    public static int getDup(String[] arr) {

        int count = 0;
        int result = 0;

        for(int i = 0; i < arr.length; i++){
            count = 0;
            for (String each: arr){
                if (arr[i].equals(each)){
                    count++;
                }
            }
            if (count > 1){
                result++;
            }
        }


        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDup(strs));

    }
}
