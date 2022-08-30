package day39_practice.employee;

public class Tester extends Employee {
//    Create a class Tester
//
//	- Tester class inherits Employee class
//
//	- create additional variables:
//    bugs found

    protected int bugsFound;

    public Tester(String name){
        super(name);
    }

//	- create method:
//    test()
//    Example output: prints Running the regression

    public void test(){
        System.out.println(name + " is running the regression");
        bugsFound++;
        salary += 50;
    }
}
