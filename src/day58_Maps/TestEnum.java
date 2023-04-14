package day58_Maps;

public class TestEnum {

    public static void main(String[] args) {
        //String browser = "Cydeo";//anything can be assigned to String

        Browser browser = Browser.chrome;

        switch (browser){

            case edge:
                System.out.println("Edge driver is selected");
                break;

            case safari:
                System.out.println("Safari driver is selected");
                break;

            case opera:
                System.out.println("Opera driver is selected");
                break;

            case firefox:
                System.out.println("Firefox driver is selected");
                break;

            default:    //for chrome
                System.out.println("Chrome driver is selected");
        }

        System.out.println(browser);

        System.out.println("-------------------------------------------------");

        //String level = "java";//anything can be assigned to String

        Level level = Level.Akbar;

        System.out.println("-------------------------------------------------");

        Month month = Month.July;

        System.out.println("---------------------------------------------------");

        Color color = Color.black;


    }

}
