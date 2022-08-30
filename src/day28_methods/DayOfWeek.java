package day28_methods;

public class DayOfWeek {
    public static void main(String[] args) {

        System.out.println(dayInWeek(4));
        System.out.println(dayInWeek(7));

        switch (dayInWeek(1)){
            case "Mon":
            case "Fri":
                System.out.println("Have full day of java");
                break;
            case "Tue":
            case "Thur":
                System.out.println("Half java, half soft skills");
                break;
            case "Wed":
                System.out.println("Office Hours");
                break;
            case "Sat":
            case "Sun":
                System.out.println("Off");
        }

    }

    // 1- Mon.. 7 - Sun

    public static String dayInWeek(int day){
        String[] days = {"Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun"};
        return days[day - 1]; // convert the number to index
    }
}
