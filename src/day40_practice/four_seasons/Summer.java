package day40_practice.four_seasons;

public class Summer extends Season{
    public Summer() {
        setName("Summer");
        setLowestTemp(65);
        setTopTemp(85);
    }

    @Override
    public void activity(){
        System.out.println("Drink Lemonade");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
