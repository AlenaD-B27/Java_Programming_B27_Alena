package GROUP_PRACTICE;

public class Example {

    public  static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile && bSmile) || (!aSmile && !bSmile) ? true : false;
    }


    public static void main(String[] args) {

        System.out.println(monkeyTrouble(true, true));
    }




}
