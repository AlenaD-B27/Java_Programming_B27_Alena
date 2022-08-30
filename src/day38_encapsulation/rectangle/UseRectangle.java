package day38_encapsulation.rectangle;

import day38_encapsulation.rectangle.Rectangle;

public class UseRectangle {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();

//        rectangle1.length = 10;
//        rectangle1.width = 5;
        // we can not access length and width directly because they have private access.

        rectangle1.setLength(10);
        rectangle1.setWidth(5);

        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.getWidth());
        // use get method to read/use the value
        // use det method to assign/reassign the values
    }
}
