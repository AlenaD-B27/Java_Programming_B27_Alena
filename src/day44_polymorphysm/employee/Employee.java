package day44_polymorphysm.employee;

public abstract class Employee extends Person{
    String jobTitle;
    double salary;

    public Employee(String name, String jobTitle, double salary) {
        super(name);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
