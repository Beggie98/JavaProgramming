package day53_Abstraction_and_Polymorphism.webDriverTask;

public interface WebDriver {//in an interface only abstract methods, static method and default methods with lambda expression are accepted
    //NO Instance methods
    //NO constructors

    void get(String url);
    void findElement(String locator);
    void getTitle();
    void quit();
    void close();

    /*
    public static void main(String[] args) {

    }

    default void method(){

    }
     */

}
/*
WebDriver task:
		1. Create an interface named WebDriver
				abstract methods:
					get(String url);
					findElement(String locator);
					getTitle();
					quit();
 */