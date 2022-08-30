package day37_static.student;

import java.util.Arrays;

public class Classroom {
    public static void main(String[] args) {

      CydeoStudent.schoolInfo();

      CydeoStudent alena = new CydeoStudent("Alena", "Chicago", 10);
        System.out.println(alena);


        System.out.println(Arrays.toString(alena.instructors)); // this is a stupid way to do it, you need to call the Class for static objects.

        System.out.println(Arrays.toString(CydeoStudent.instructors)); // this is the correct way to do it.

        System.out.println(alena.myCoffee.amountLeft);

        alena.drink();

        System.out.println(alena.myCoffee.amountLeft);

        CydeoStudent aili = new CydeoStudent("Aili", "Ottawa", 1 );

        aili.drink();
        aili.drink();
        aili.drink();

        System.out.println(aili.myCoffee.amountLeft);
















    }
}
