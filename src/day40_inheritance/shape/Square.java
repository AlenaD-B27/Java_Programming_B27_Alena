package day40_inheritance.shape;

public class Square extends Shape{

    double side;
    public Square(double side){
        super("Square");
        this.side = side;
    }
    @Override
    public double area(){
        return side * side;
       // Math.pow(side, 2);
    }

    @Override
    public double perimeter(){
        return side * 4;
    }

    @Override
    public String toString() {
       return super.toString() + "\nSide: " + side;
    }

}
