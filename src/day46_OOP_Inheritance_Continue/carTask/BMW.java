package day46_OOP_Inheritance_Continue.carTask;

public class BMW extends Car {

    public static boolean isLuxuryBrand = true;

    public BMW(String model, int year, double price, String color, double miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breaksDown(){
        System.out.println(brand + " " + model + " breaks down frequently");
    }

    public void race(){
        System.out.println(brand + " " + model + " is good for racing");
    }


    @Override
    public void start() {
        System.out.println("Call mechanic");
        System.out.println("Oil change");
        System.out.println("Jump start");
    }
}
/*
2. BMW:
					extra methods:
						breaksDown()
						race()
 */