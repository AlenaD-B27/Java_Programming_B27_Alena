package day40_practice.four_seasons;

public class CheckSeason {
    public static void main(String[] args) {


        Winter winter = new Winter();
        Summer summer = new Summer();
        Spring spring = new Spring();
        Fall fall = new Fall();

        System.out.println(winter);
        System.out.println(summer);
        System.out.println(spring);
        System.out.println(fall);

        winter.activity();
        summer.activity();
        spring.activity();
        fall.activity();

    }
}
