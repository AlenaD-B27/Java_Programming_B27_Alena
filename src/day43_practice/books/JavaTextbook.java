package day43_practice.books;

public class JavaTextbook extends EBook {
    @Override
    public void download() {
        System.out.println("Downloading Java Textbook...");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
           e.getMessage();
        }
        System.out.println("Java Textbook is downloaded.");
    }

    @Override
    public void open() {
        System.out.println("Java Textbook is open");

    }
}
