package GROUP_PRACTICE;
import java.util.Scanner;
public class Sleep {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in) ;
        System.out.println(" How many hours are you sleep every day ? ");
        int hour = input.nextInt();
        int month = 30 * hour/24;
        int year = 365 * hour/24;
        int life = 365 * hour*60/24;

        //60yrs

         System.out.println("In one year " + year + " days you sleep");
         System.out.println("In whole life " + life + " days you sleep");
         System.out.println("In one month " + month + " days you sleep");
         System.out.println("In one year " + ( year/30 )+ " months you sleep");
         System.out.println("In whole life " + ( life/365) + " years you sleep");






    }
}
