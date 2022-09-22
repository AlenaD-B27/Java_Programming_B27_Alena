package GROUP_PRACTICE.alena_goes_camping;

import java.util.Arrays;
import java.util.Scanner;

public class Camping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("input name:");
        Tourist tourist1 = new Tourist(input.next());

        System.out.println("input 3 items:");
        tourist1.setBelongings(new String [] {input.next(),input.next(),input.next()});

        System.out.println(tourist1);

        tourist1.setUpTent();

      //  tourist1.setBelongings(new String [] {"1", "2", "3", "4"});
      //  System.out.println(tourist1);











    }
}
