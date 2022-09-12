package day42_abstraction.person;

public class WorkPlace {
    public static void main(String[] args) {


     //   Person obj = new Person();
     //   Employee obj2 = new Employee();
        // we can not create objects of the abstract classes

        Tester baz = new Tester("Baz", 20, "SDET", 100_000);

        System.out.println(baz);
        baz.sleep(8);
        baz.work();




    }
}
