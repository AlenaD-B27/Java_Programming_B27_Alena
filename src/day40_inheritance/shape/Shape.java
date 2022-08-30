package day40_inheritance.shape;

public class Shape {

    String type;

    public Shape(String type){
        this.type = type;
    }

    public double area(){
        return 0.0;
    }

    public double perimeter(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Shape: " + type + "\nArea: " + area() + "\nPerimeter: " + perimeter();
    }
}
