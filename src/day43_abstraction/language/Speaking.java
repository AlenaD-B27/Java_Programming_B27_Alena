package day43_abstraction.language;

public class Speaking {

    public static void main(String[] args) {
        English obj = new English();
        obj.hello();
        obj.bye();

        Spanish obj2 = new Spanish();
        obj2.hello();
        obj2.bye();

    }
}
