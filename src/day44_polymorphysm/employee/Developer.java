package day44_polymorphysm.employee;

public final class Developer extends Employee{
    public Developer(String name, String jobTitle, double salary) {
        super(name, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println("writing a function");
    }

    public void unitTesting(){
        System.out.println("Running unit test on function");
    }
}
