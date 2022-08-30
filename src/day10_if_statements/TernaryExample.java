package day10_if_statements;

public class TernaryExample {
    public static void main(String[] args) {

        int score2 = 50;
        String result;

        if (score2 > 70){
            result = "Passing";
        }else {
            result = "Failing";
        }
        System.out.println(result);
        System.out.println("--------------------------------");

        int score3 = 80;
        String result2 = score3 > 70 ? "Passing" : "Failing"; // sorting the result to a String variable
        System.out.println(result2);
        System.out.println(score3 > 70 ? "Passing" : "Failing"); // printing AND sorting the result


        System.out.println("==================================================");
int n = 9;
        System.out.println(n % 2 == 0 ? "even" : "odd");

        System.out.println("====================================================");


        boolean isGreen = false;
        System.out.println(isGreen ? "Drive" : "Stop");

//        Can you imagine how much time it saves you??? use it instead of if statement

        System.out.println("============================================");

        int num = 10;
        System.out.println(num > 0 ? "Positive" : n < 0 ? "Negative" : "Zero");

        // if = ?, else = : , else if = boolean ? result : boolean ? result ,
        // else if else = boolean ? result : boolean ? resul : result.










    }
}
