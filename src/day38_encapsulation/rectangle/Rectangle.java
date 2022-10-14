package day38_encapsulation.rectangle;

public class Rectangle {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) { //obj.set(what is the new value)==> {the new value is assigned}
        this.length = length;
    }
    public double getWidth(){  // access modifier, return type/ or void, name of the method (parameters){action, if return --> keyword return and what to return ---> see the return type.
        return  width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
