package day39_practice.employee;

public class Developer extends Employee {
//    Create a class Developer
//
//	- Developer class inherits Employee class
//
//	- create additional variables:
//    features created

     protected int featuresCreated;

    public Developer(String name){
        super(name);
    }

//	- create method:
//    develop()
//    Example output: prints Creating more features

    public void develop(){
        System.out.println(name + " is creating more features");
        featuresCreated++;
        salary += 100;
    }

}
