package day42_abstraction.person;

import java.util.ArrayList;
import java.util.Arrays;

public class WorkPlace {
    public static void main(String[] args) {


     //   Person obj = new Person();
     //   Employee obj2 = new Employee();
        // we can not create objects of the abstract classes

        Tester baz = new Tester("Baz", 20, "SDET", 100_000);

        System.out.println(baz);
        baz.sleep(8);
        baz.work();

        ArrayList <Tester> testers = new ArrayList<>();
        testers.add(baz);
        testers.addAll(Arrays.asList(
                new Tester("Bato", 30, "SDET", 150_000),
                new Tester("Alena", 27, "senior SDET", 180_000),
                new Tester ("Nasiba", 25, "QA engineer", 120_000 )
        ));

        System.out.println();


        for(Tester each : testers){
            System.out.println(each);
            each.sleep(8);
            System.out.println("====================");
        }




    }
}
