package day38_encapsulation.traffic_light;

public class TrafficLight {

   private String color;

    public TrafficLight(String color) {
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        if(color.equals("green") || color.equals("yellow") || color.equals("red")){
        this.color = color;}
        // if this boolean is false (not a valid color) then nothing is assigned to the color variable
    }
}
