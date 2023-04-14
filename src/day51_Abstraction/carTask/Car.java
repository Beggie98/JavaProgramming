package day51_Abstraction.carTask;

public abstract class Car {

    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String color;
    public static boolean hasWheels, hasEngine;

    static {
        hasWheels = true;
        hasEngine = true;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0){
            throw new RuntimeException("Invalid price: " + price);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String make, String model, int year, double price, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public abstract void start();

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price= $" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
Car
	Car:
		start();

	Toyota extends Car:
		start(): twist the key

	Audi extends Car:
		start(): push start button

	Tesla extends Car:
		start(): voice control

	BMW extends Car:
		start(): jump start
 */