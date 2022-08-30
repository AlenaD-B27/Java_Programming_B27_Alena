package day35_custom_classes.traffic;

public class TrafficLight {

    String color;

    public TrafficLight(String inputColor){

        boolean isValid = inputColor.equalsIgnoreCase("red") || inputColor.equalsIgnoreCase("green") || inputColor.equalsIgnoreCase("yellow");

        if(isValid){

        color = inputColor;
        }
    }

}
