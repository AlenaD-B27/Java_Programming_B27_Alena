package day30_wrapper;

public class GoogleSearch {
    public static void main(String[] args) {

        String str = "About 1,690,000,000 results (0.49 seconds)";
        String [] parts = str.split(" ");
      //  System.out.println(parts[1].replace(",",""));
        int result = Integer.parseInt(parts[1].replace(",",""));

        if (result > 10_000_000){
            System.out.println("narrow the search down");
        }

        double seconds = Double.parseDouble(parts[3].substring(1));

        if(seconds > 1.0){
            System.out.println("Search took too long");
        } else if(seconds > 0.5){
            System.out.println("okay but could be better");
        } else {
            System.out.println("good speed");
        }















    }
}
