package day31_practice;


import java.util.ArrayList;

public class Add {
    public static void main(String[] args) {

        /*
        Create an ArrayList of Strings
add these elements:
    add Hat
    add Shoes
    add Jacket in middle of Hat and Shoes
    add Towel in the beginning
    add Car between Towel and Hat

Print the ArrayList after each action to see how the change is made
         */

        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hat");
        strings.add("Shoes");
        System.out.println(strings);
        strings.add(strings.indexOf("Hat") + 1, "Jacket" ); // or .indexOf("Shoes")
        System.out.println(strings);
        strings.add(0, "Towel");
        System.out.println(strings);
        strings.add(strings.indexOf("Hat"), "Car");
        System.out.println(strings);














    }
}
