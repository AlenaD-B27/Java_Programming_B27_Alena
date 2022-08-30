package day40_practice.four_seasons;

public class Spring extends Season{
    public Spring() {
        setName("Spring");
        setLowestTemp(33);
        setTopTemp(70);
    }

    @Override
    public void activity() {
        System.out.println("Go Outside");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
