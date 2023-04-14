package day53_Abstraction_and_Polymorphism.webDriverTask;


public class AutomationTesting {

    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("www.google.com");
        chromeDriver.findElement("xpath");
        chromeDriver.getTitle();
        chromeDriver.close();
        chromeDriver.quit();

        System.out.println("-----------------------------------------------------");

        FireFoxDriver fireFoxDriver = new FireFoxDriver();
        fireFoxDriver.get("www.google.com");
        fireFoxDriver.findElement("xpath");
        fireFoxDriver.getTitle();
        fireFoxDriver.close();
        fireFoxDriver.quit();

        System.out.println("----------------------------------------------------------");

        OperaDriver operaDriver = new OperaDriver();
        operaDriver.get("www.google.com");
        operaDriver.findElement("xpath");
        operaDriver.getTitle();
        operaDriver.close();
        operaDriver.quit();

        System.out.println("-------------------------------------------------------------");

        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("www.google.com");
        edgeDriver.findElement("xpath");
        edgeDriver.getTitle();
        edgeDriver.close();
        edgeDriver.quit();

        System.out.println("-----------------------------------------------------------------");

        WebDriver driver5 = new FireFoxDriver();//Parent class is being a reference for child class (Polymorphism)
        driver5.get("www.amazon.com");

        System.out.println("---------------------------------------------");

        WebDriver driver6 = getDriver("chrome");

        //WebDriver driver7 = new ChromeDriver();



    }

    public static WebDriver getDriver(String name){
        WebDriver driver;
        switch (name){
            case "chrome":
                driver = new ChromeDriver();
                break;

            case "firefox":
                driver = new FireFoxDriver();
                break;

            default:
                throw new RuntimeException("Invalid Browser name");
        }

        return driver;

    }

}
