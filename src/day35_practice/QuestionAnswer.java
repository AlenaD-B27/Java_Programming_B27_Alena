package day35_practice;

public class QuestionAnswer {
    public static void main(String[] args) {
//        Q: What does a constructor do?
        System.out.print("Constructor is the METHOD which creates an Object in a Class and INITIALIZES the instant variables in a Class.");
//        Q: When is the constructor called?

        System.out.print(" Constructor is ALWAYS called when Object is created. If there's no arguments it means that the Constructor is default (created by compiler) and all the variables are initialized as default ones. The Class never can exist without Constructor.");
//                Q: What is the difference of a local variable and instance variable

        System.out.print(" Instance variables belong to the Class, local ones belong to an Object. Local variables are always prioritized by JVM.");
//        Q: What is this keyword used for

        System.out.print(" \"this.variable\" is used to call the instant variable inside of a Constructor in case if the local variable with the same name is already declared. this.x = x. this.x - instant, x - local. If we do not use this. than our x will be considered by JVM as a local variable (because local variables are prioritized by JVM.");

    }
}
