package day53_Abstraction_and_Polymorphism.webDriverTask;

public class FireFoxDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("FireFoxDriver - navigating to: " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("FireFoxDriver - locating the element by " + locator);
    }

    @Override
    public void getTitle() {
        System.out.println("FireFoxDriver - getting the title");
    }

    @Override
    public void quit() {
        System.out.println("FireFoxDriver - quit");
    }

    @Override
    public void close() {
        System.out.println("FireFoxDriver - closing the tab");
    }
}
