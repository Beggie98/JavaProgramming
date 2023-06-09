package day53_Abstraction_and_Polymorphism.webDriverTask;

public class EdgeDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("EdgeDriver - navigating to: " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("EdgeDriver - locating the element by " + locator);
    }

    @Override
    public void getTitle() {
        System.out.println("EdgeDriver - getting the title");
    }

    @Override
    public void quit() {
        System.out.println("OperaDriver - quit");
    }

    @Override
    public void close() {
        System.out.println("EdgeDriver - closing the tab");
    }
}
