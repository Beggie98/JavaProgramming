package day47_Recap.browserTask;

public class BrowserObjects {

    public static void main(String[] args) {
        Chrome chrome = new Chrome();
        chrome.open();
        chrome.close();
        System.out.println("------------------------------------------");

        Firefox firefox = new Firefox();
        firefox.open();
        firefox.close();
        System.out.println("--------------------------------------------------------");

        Opera opera = new Opera();
        opera.open();
        opera.close();
        System.out.println("------------------------------------------------");
        
        Safari safari = new Safari();
        safari.open();
        safari.close();

        System.out.println("--------------------------------------");

        Edge edge = new Edge();
        edge.open();
        edge.close();
    }

}
