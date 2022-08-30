package day05_arithmetic_operators;

public class Pizza {
    public static void main(String[] args) {

        String type = "Cheese";
        int slices = 10;
        int people = 3;
        int slicesPerPerson = slices/people;
        int leftover = slices%people;

        System.out.println(people+" people are going to eat the "+type + " pizza. Every person will get "+slicesPerPerson+ " slices and there will be "+leftover+" slice leftover.");






    }
}
