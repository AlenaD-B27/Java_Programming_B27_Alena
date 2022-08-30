package day03_variables;

public class DateTomorrow {
    public static void main(String[] args) {

         /*
            declare and assign 3 variables(numbers)
            month, day, year

            print the date in this format:
                Date: month \ day \ year

            also update the day for tomorrow date
            print tomorrow's date in this format:
               Tomorrow's Date: month \ day \ year
         */

        int month = 6;
        int day = 13;
        int year = 2022;
        System.out.println("\t\t   Date: " + "0" + month + " \\ " + day + " \\ " + year);
        day = 14;
        System.out.println("Tomorrow's Date: " + "0" + month + " \\ " + day + " \\ " + year);


        System.out.println();
        System.out.println();

        //===========================================================================================

        int month1, day1, year1;
        month1 = 1;
        day1 = 22;
        year1 = 3000;
        System.out.println("Date: " + month1 + " \\ " + day1 + " \\ " + year1);




        System.out.println();
        System.out.println();

        //OR======OR======WE CAN ASSIGN AND DECLARE IN THE SAME LINE=================================

        int month2 = 4, day2 = 7, year2 = 1995;
        System.out.println("I was born in: " + month2 + " \\ " + day2 + " \\ " + year2);






    }
}
