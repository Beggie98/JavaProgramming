package day49_Exceptions;

public class ThrowKeyword {
//throw keyword: manually throw (create) an exception
//Syntax: throw objectOfException
    public static void main(String[] args) {

        //throw new RuntimeException("This is an unexpected event");//throwing an exception to stop following code fragments

        //System.out.println("");//compile error

        String browser = "Chrome";

        //chrome, firefox, opera, safari

        if (browser.equalsIgnoreCase("chrome")){
            System.out.println("Chrome browser selected");
        }else if (browser.equalsIgnoreCase("firefox")){
            System.out.println("Firefox browser selected");
        }else if (browser.equalsIgnoreCase("opera")){
            System.out.println("Opera browser selected");
        }else if (browser.equalsIgnoreCase("Safari")){
            System.out.println("safari browser selected");
        }else {
            throw new RuntimeException("Invalid Browser name: " + browser);
        }

        //throw new Circle(20);

        //throw new BreakTimeException("Time to take 15 minutes break");//custom unchecked exception

        throw new BreakTimeException();

    }


}
