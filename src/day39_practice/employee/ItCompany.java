package day39_practice.employee;

public class ItCompany {
    public static void main(String[] args) {

        Employee alena = new Employee ("Alena");

        Tester oleg = new Tester("Oleg");

        Developer takhir = new Developer("Takhir");


        oleg.salary = 150_000;
        takhir.salary = 200_000;
        alena.salary = oleg.salary + takhir.salary;

        alena.isFullTime = true;

        alena.work();
        System.out.println(alena.salary);

        oleg.bugsFound = 3;


        while(oleg.salary <= 200_000){
            while(takhir.featuresCreated <= 12 && oleg.bugsFound <= 20){
                takhir.develop();
                oleg.test();
            }
            System.out.println("bugs found " + oleg.bugsFound);
            break;
        }



        System.out.println(alena.name + " has salary: $" + alena.salary);

        System.out.println(oleg.name + "has salary: $" + oleg.salary);

        System.out.println(takhir.name + "has salary: $" + takhir.salary);

        System.out.println("Bugs found: " + oleg.bugsFound);
        System.out.println("Features created: " + takhir.featuresCreated);















    }
}
