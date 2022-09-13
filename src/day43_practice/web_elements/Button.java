package day43_practice.web_elements;

public class Button implements WebElement, Clickable{
    @Override
    public void click() {
        System.out.println("Clicked on Button");
    }

    @Override
    public void getText() {
        System.out.println("Button Text is displayed");
    }
}
