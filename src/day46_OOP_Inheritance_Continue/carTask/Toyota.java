package day46_OOP_Inheritance_Continue.carTask;

public class Toyota extends Car{

    public static boolean isReliable = true;
    public Toyota(String model, int year, double price, String color, double miles) {
        super("Toyota", model, year, price, color, miles);
    }


}
/*
Create the following sub classes of Car:
			1. Toyota:
					extra methods:
							reliabile()
 */