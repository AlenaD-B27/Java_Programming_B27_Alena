package day43_practice.web_elements;

public class InputField implements WebElement, Clickable, Input{
    @Override
    public void click() {
        System.out.println("The cursor is in the input field");
    }

    @Override
    public void sendKeys() {
        System.out.println("Keys are sent");
    }

    @Override
    public void getText() {
        System.out.println("The text displayed on the input field");
    }
}
