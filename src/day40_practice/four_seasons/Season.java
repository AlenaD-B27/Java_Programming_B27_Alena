package day40_practice.four_seasons;

public class Season {
    String name;
    double topTemp;
    double lowestTemp;

    public Season() {
    }

    public Season(String name) {
        if (name.equals("Winter") || name.equals("Summer") || name.equals("Fall") || name.equals("Spring") )
        this.name = name;
    }

    public Season(String name, double topTemp, double lowestTemp) {
        this.name = name;
        this.topTemp = topTemp;
        this.lowestTemp = lowestTemp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTopTemp() {
        return topTemp;
    }

    public void setTopTemp(double topTemp) {
        this.topTemp = topTemp;
    }

    public double getLowestTemp() {
        return lowestTemp;
    }

    public void setLowestTemp(double lowestTemp) {
        this.lowestTemp = lowestTemp;
    }

    protected void activity(){
    }

    @Override
    public String toString() {
        return "Season{" +
                name +
                ", highest average temperature = " + topTemp +
                ", lowest average temperature = " + lowestTemp +
                '}';
    }
}
