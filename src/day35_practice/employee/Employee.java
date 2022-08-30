package day35_practice.employee;

public class Employee {
//    create a class called Employee
//
//        - data:
//
//    name, id, job title, salary
String name;
int id;
String jobTitle;
double salary;
//        - constructor
//
//            - create a constructor that creates an Employee object with the name, id, job title, and salary
public Employee(String name, int id, String jobTitle, double salary){
    this.name = name;
    this.id = id;
    this.jobTitle = jobTitle;
    this.salary = salary;
}
//        - method:
//
//    goToMeeting()
//    when this method is called print:
//    $name is going to a meeting
public void goToMeeting(){
    System.out.println(name + " is going to meeting");
}
//    toString()
//    print all the employees information


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

//    Create a separate class to create and test the Employee objects
}
