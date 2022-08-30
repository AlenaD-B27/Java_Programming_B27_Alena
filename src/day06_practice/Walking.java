package day06_practice;

public class Walking {
    public static void main(String[] args) {
//        create a class Walking
//  declare and assign a boolean variable is raining
//        declare and assign a temperature variable
//        check if you should go for a walk. You should go for a walk if it is not raining and the temperature is more than 68

boolean isRaining = false;
int temperature = 85;
boolean shouldGo = isRaining !=true && temperature > 68;
        System.out.println("shouldGo = " + shouldGo);




    }
}
