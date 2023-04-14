package day46_OOP_Inheritance_Continue.carTask;

public class Tesla extends Car{

    public static boolean isElectric = true;

    public Tesla(String model, int year, double price, String color, double miles) {
        super("Tesla", model, year, price, color, miles);
    }

    //@Override//fails to compile as the method below is not overriden
    public void autoPilot(){
        System.out.println(brand + " " + model + " is driving by itself");
    }
    /*@Override//to check if the method is overriden
    public void start(){//method is overriden
        System.out.println("Push the start button");
    }
     */


    //overriding methods with shortcuts
    @Override
    public void start() {
        //super.start();//default implementation
        System.out.println("Push the start button");
    }


    //access modifier of override method MUST be same or more visible
    //ONLY instance methods can be overriden
}
/*
3. Tesla:
					extra methods:
						autoPilot();
 */