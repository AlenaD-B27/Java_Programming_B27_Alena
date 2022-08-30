package day38_practice.square;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square(2);
        System.out.println(square);
        square.setSide(3.5);
        System.out.println(square.getSide());
        System.out.println(square);
        System.out.println(square.calculatePerimeter());
        square.setSide(-2);
        System.out.println(square);
    }
}
