package day39_practice.employee;

public class Employee {

//    Create an Employee class
//	- create variables:
//		name, is full time, salary

String name;
boolean isFullTime;
double salary;

public Employee(String name){
    this.name = name;
}

//	- create method:
//		work();
//			Example output: prints $name is working
     public void work(){
         System.out.println(name + " is working");
     }




}
