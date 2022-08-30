package day40_inheritance.hiding;

public class Parent {
    public static void hello(){
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent{
    //@Override: will not work because static methods can not override
    public static void hello(){ // by making this method I HIDE the Parent method
        System.out.println("Hello from Child");
    }
}

class Run{
    public static void main(String[] args) {
        Parent.hello();
        Child.hello();
    }

}
