package day38_practice.square;

public class Square {

    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side >= 0)
        this.side = side;
    }

    double calculateArea () {
        return side*side;
    }

    double calculatePerimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Square: " +
                "side = " + side +
                "; area = " + calculateArea() +
                "; perimeter = " + calculatePerimeter() + ";";
    }
}
