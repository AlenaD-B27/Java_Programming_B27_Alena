package replit;

public class MyQuestion08_Replit_EvensOdds_Solved {
    public static void main(String[] args) {


        int n = 1;

        String odds = "";
        String evens = "";

        for( n = 1; n <= 20; n++){

            if(n % 2 == 0){
                evens += n + " ";

            } else {
                odds += n + " ";

            }


        }


        System.out.println(evens);
        System.out.println(odds);













    }
}
