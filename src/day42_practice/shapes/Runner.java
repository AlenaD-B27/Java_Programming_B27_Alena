package day42_practice.shapes;

public class Runner {
    public static void main(String[] args) {

        System.out.println(new Circle("circle", 2.5).area());
        System.out.println(new Circle("circle1", 1.4).perimeter());
        System.out.println(new Circle("circle 3", 5));
        System.out.println("-------------------------");

        System.out.println(new Rectangle("obj1", 10, 15).area());
        System.out.println(new Rectangle("obj2", 25, 25).perimeter());
        System.out.println(new Rectangle("rectangle", 12.2, 8.3));




    }
}
