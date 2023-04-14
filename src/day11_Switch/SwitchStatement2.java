package day11_Switch;

public class SwitchStatement2 {
    public static void main(String[] args) {

        String name = "cybertek";

        switch (name){
            case "firefox":
                System.out.println("Firefox has been selected");
                break;
            case "chrome":
                System.out.println("Chrome has been selected");
                break;
            case "edge":
                System.out.println("Edge has been selected");
                break;
            default:
                System.err.println("Invalid Browser");//error message
                break;

        }




    }
}
