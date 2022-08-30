package day10_11_practice;

public class Retake {
    public static void main(String[] args) {
//        create a class Retake
////
////declare and assign a grade variable
////        declare and assign an attempt number
////
////        Doing a retake for the assignment will reduce the grade by a percentage based on the number of attempts taken:
////
////        If its the first attempt -> subtract 10%
////                If its the second attempt -> subtract 20%
////                If its the third attempt -> subtract 35%
////
////                Based on the retake attempt number calculate the final grade
////
////        -----------------------------------------------------------

        int numberOfAttempts = 3;
        double grade = 100;
        if (numberOfAttempts == 1){
            grade -= grade * 0.1;
            numberOfAttempts--;
        }else if (numberOfAttempts == 2){
            grade -= grade * 0.2;
            numberOfAttempts--;
        }else if (numberOfAttempts == 3){
            grade -= grade * 0.35;
            numberOfAttempts--;
        }
        System.out.println("grade = " + grade);
        System.out.println("numberOfAttempts = " + numberOfAttempts);








    }
}
