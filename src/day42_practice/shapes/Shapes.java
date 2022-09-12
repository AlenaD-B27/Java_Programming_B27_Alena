package day42_practice.shapes;

public abstract class Shapes {

public final String name;

public Shapes(String name){
    this.name = name;
}

    public abstract double area();
    public abstract double perimeter();
//    override the toString to return the name, area and perimeter


    @Override
    public String toString() {
        return name + " " + area() + " " + perimeter();
    }
}
