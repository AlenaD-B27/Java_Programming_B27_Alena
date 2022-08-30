package day37_static.school;

import java.sql.SQLOutput;

public class District {
    public static void main(String[] args) {

        School.district = 149;
        School.totalTeachers = 100;
        School.totalStudents = 3000;

        School.totalTeachers--;
        System.out.println(School.totalTeachers);
        System.out.println(School.totalStudents);
        System.out.println(School.district);

        School.announcement();
        // School.lunch(); the lunch() method is instance;

        School middle = new School();
        middle.lunchTime = 12;
        middle.lunch();

        middle.totalStudents = 5000; //yes, it's going to work but in terms of convention should use class to call static methods.
        System.out.println(School.totalStudents);







    }
}
