package day43_practice.web_elements;

public class Link implements WebElement, Clickable {
    @Override
    public void click() {
        System.out.println("Website is opening");
    }

    @Override
    public void getText() {
        System.out.println("Text displayed on the link");

    }
}
