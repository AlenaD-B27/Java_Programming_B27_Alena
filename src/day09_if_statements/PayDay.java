package day09_if_statements;

public class PayDay {
    public static void main(String[] args) {

        double hourlyRate = 60;
        int hoursPerWeek = 50;
        double netPay;

        if(hoursPerWeek > 40){
            // overtime calculation
            int overTime = hoursPerWeek - 40;
            netPay = hourlyRate * 40;
            netPay += hourlyRate * overTime * 1.5;


        }else{
            // worked under or equal 40 hours, so no overtime
            netPay = hourlyRate * hoursPerWeek;
        }

        System.out.println("Net pay: " + netPay);



    }
}
