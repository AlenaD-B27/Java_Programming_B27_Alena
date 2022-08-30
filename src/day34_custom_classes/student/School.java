package day34_custom_classes.student;

public class School {
    public static void main(String[] args) {

        Student student1 = new Student();
        System.out.println(student1);
        student1.name = "Alena";
        student1.batchNumber = 27;
        student1.grade = 85.6;
        student1.program = "SDET";

        System.out.println(student1);
        System.out.println(student1.name);
        System.out.println(student1.batchNumber);
        System.out.println(student1.grade);
        System.out.println(student1.program);

        student1.study();


    }
}
