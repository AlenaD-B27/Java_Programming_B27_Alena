package day37_static.student;

import java.util.Arrays;

public class CydeoStudent {

    String name;
    String city;
    int group;
    Coffee myCoffee;

    static int batchNumber;
    static String schoolName;
    static String[] instructors;

    static {
        batchNumber = 27;
        schoolName = "Cydeo";
        instructors = new String [] {"Adam", "Asya", "Saim"};
    }

    public CydeoStudent(String name, String city, int group) {
        this.name = name;
        this.city = city;
        this.group = group;
        myCoffee = new Coffee(16);
    }

    public static void schoolInfo(){
        System.out.println(schoolName + "Batch " + batchNumber);
        System.out.println("Instructors: " + Arrays.toString(instructors));
    }

    public void drink(){
        myCoffee.amountLeft -= 2;
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", group=" + group +
                '}';
    }
}
