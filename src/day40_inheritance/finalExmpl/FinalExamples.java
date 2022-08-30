package day40_inheritance.finalExmpl;

public class FinalExamples {

    public final int a = 10; // hard coded instance variable
    public final int b;

    public FinalExamples(int num) { // Constructor
        b = num; // when we create the object, the given argument will be the value of b, then it cannot be changed
    }

    public static final String PLANET = "Earth";

    public static final String TEST_1 = "test_1.us.google.com";

    // public static final -> these keyword together is what makes a constant


}
