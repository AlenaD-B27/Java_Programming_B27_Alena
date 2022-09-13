package day43_practice.shopping;

public final class Target extends Shopping {
    @Override
    public void buyItem() {
        System.out.println("buying item from Target");
    }

    @Override
    public void returnItem() {
        System.out.println("returning item to Target");
    }
}
