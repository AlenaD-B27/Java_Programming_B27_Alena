package day11_nested;

public class Retake {
    public static void main(String[] args) {

 /*
    create a class Retake

declare and assign a grade variable
declare and assign an attempt number

Doing a retake for the assignment will reduce the grade by a percentage based on the number of attempts taken:

    If its the first attempt -> subtract 10%
    If its the second attempt -> subtract 20%
    If its the third attempt -> subtract 35%

Based on the retake attempt number calculate the final grade

     */



            double grade = 100;
            int attemptNumber = 3;
            double finalGrade = 0;

            if(attemptNumber == 1){
                finalGrade = grade * 0.9;  // 90% of grade, which is minus 10%
            } else if(attemptNumber == 2){
                finalGrade = grade * 0.8; // 80% of grade, which is minus 20%
            } else if(attemptNumber == 3){
                finalGrade = grade * 0.65; // 65% of grade, which is minus 35%
            }

            System.out.println(finalGrade);











    }
}
