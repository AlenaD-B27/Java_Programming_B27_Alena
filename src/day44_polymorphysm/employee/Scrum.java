package day44_polymorphysm.employee;

public class Scrum {
    public static void main(String[] args) {

        // reference of superclass

        Person tester1 = new Tester("James Bond","Secret Agent", 150_000);

//        tester1.work();
//        tester1.create();

        // these are not accessible because the Person reference doesn't have access to them

        // tester1 can access the name variable only so:

        Employee tester2 = new Tester ("Jose Penso", "SDET", 200_000);

        tester2.work();

        // tester2 has access to name, jobTitle, salary and work();

        Object tester3 = new Tester ("Milana Ra", "Senior Tester", 300_000);

        // tester3 doesn't have access to anything from Person, Employee, or Tester.

        CreateSmokeTest tester4 = new Tester("Merve Ankara", "SDET", 203_000);

      //  tester4.work();
        tester4.create(); // this is the only method we have access to

        // reference of itself:
        Tester tester5 = new Tester("Rose Turan", "QA", 200_000);

        //tester5 has access to everything : all the variables and all the methods









    }

}
