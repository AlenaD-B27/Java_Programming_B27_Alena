package day42_abstraction.exercise;

public class Gym {
    public static void main(String[] args) {

       // Exercise obj = new Exercise();  // not valid cuz Exercise is an abstract class and abstract classes can not make objects.

        Running run = new Running();
        run.perform();
        run.getCaloriesBurned(30);

       // Lifting obj = new Lifting(); // Lifting is abstract, so we can not create an object from an abstract class

        BenchPress benching = new BenchPress();
        benching.perform();
        benching.getCaloriesBurned(20);
        benching.rackWeights();













    }
}
