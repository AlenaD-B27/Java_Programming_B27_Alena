package day44_polymorphysm.employee;

public final class Tester extends Employee implements CreateSmokeTest{

    @Override
    public void create() {
        System.out.println("creating the smoke test");
    }

    public Tester(String name, String jobTitle, double salary) {
        super(name, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println("running test cases");
    }

    public void writeBugReport(){
        System.out.println("Found bug, writing report");
    }
}