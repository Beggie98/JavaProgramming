package day53_Abstraction_and_Polymorphism.webDriverTask;

public class ChromeDriver implements WebDriver{//IS A Relation
    @Override
    public void get(String url) {
        System.out.println("ChromeDriver - navigating to: " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("ChromeDriver - locating the element by " + locator);
    }

    @Override
    public void getTitle() {
        System.out.println("ChromeDriver - getting the title");
    }

    @Override
    public void quit() {
        System.out.println("ChromeDriver - quit");
    }

    @Override
    public void close() {
        System.out.println("ChromeDriver - closing the tab");
    }
}
