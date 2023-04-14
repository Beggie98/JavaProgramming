package day47_Recap.browserTask;

public final class Chrome extends Browser {//to make a class immutable, we need to add final keyword
    /*
    public final String name;//"John"

    public Chrome(String name){
        this.name = name;
    }

     */

    @Override
    public void open() {
        System.out.println("Opening Chrome Browser");
    }

    @Override
    public void close() {
        System.out.println("Closing Chrome Browser");
    }
}
/*
openBrowser(): prints "opening chrome browser"
				closeBrowser():  prints "closing chrome browser"

 */