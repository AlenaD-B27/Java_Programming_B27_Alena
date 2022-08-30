package day40_practice.four_seasons;

public class Fall extends Season {
    public Fall() {
        setName("Fall");
        setLowestTemp(45);
        setTopTemp(68);
    }

    @Override
    public void activity() {
        System.out.println("Read A Book");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
