package day40_inheritance.finalExmpl;

public class UsingFinal extends Test{
    // extends FinalExamples doesn't work because FinalExample class is final
    // extends String
    // extends Math
    public static void main(String[] args) {

        FinalExamples obj1 = new FinalExamples(20);
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        // cannot change final variables
//        obj1.a = 4;
//        obj1.b = 40;

        System.out.println(FinalExamples.PLANET);

//        FinalExamples.PLANET = "Mars";

        Test obj2 = new Test();
        obj2.helloWorld();

    }

//    @Override
//    public void helloWorld(){
//         cannot override final methods
//    }

}

class Test {
    public final void helloWorld() {
        System.out.println("Hello World");
    }
}