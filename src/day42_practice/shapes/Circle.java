package day42_practice.shapes;

public class Circle extends Shapes {

    public double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.pow(radius, 2)*Math.PI;
    }

    @Override
    public double perimeter() {
        return Math.PI*2*radius;
    }

    @Override
    public String toString() {
        return super.toString() + " " + radius;
    }
}
