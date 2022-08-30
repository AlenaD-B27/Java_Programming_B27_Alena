package day40_practice.four_seasons;

public class Winter extends Season{

    public Winter() {
        setName("Winter");
        setLowestTemp(-10);
        setTopTemp(33);
    }

    @Override
    public void activity() {
        System.out.println("Use Fireplace");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
