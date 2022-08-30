package day39_inheritance.people;

public class Employee extends Person {

    double salary;

    public Employee(String name, int age, double salary){ // constructor

        super(name, age);      // calling parent constructor with no args will not work as parent constructor has arguments (if it would be default one calling with no args would work); SEE COMMENTS BELOW MARKED AS "******"

        this.salary = salary;

        // it is a rule that super() must be before "this." If you do
       /* this.salary = salary;
        super(name, age); */
        // just will not work.
    }

    /*
    ******
    public Employee(){
    super() // calls parent constructor with no args
    }
     */


    /*
    ******
    when inherit - constructor is not inheritable, so we have to call the parent constructor. And that's why we use super(); You use this() for child and super() for parent. Inheritance is basically copy-pasting and super() is CALLING.
     */


    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
