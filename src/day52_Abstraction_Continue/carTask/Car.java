package day52_Abstraction_Continue.carTask;

public abstract class Car {
    private final String make, model;
    private String color;
    private final int year;
    private double price;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0){
            throw new RuntimeException("Invalid amount: " + price);
        }
        this.price = price;
    }

    public Car(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        setColor(color);
        this.year = year;
        setPrice(price);
    }

    public abstract void start();

    public abstract void drive();

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
/*
CarTask:

	interface AutoPilot
		selfDrive();

	interface AutoPark
		autoPark();

	Abstarct Car
		start();
		drive();

	Toyota extends Car

	BMW extends Car

	Audi extends Car implement AutoPark

	Mercedes extends Car implement AutoPark

	Tesla extends Car implements AutoPilot, AutoPark

	Nio  extends Car implements AutoPilot, AutoPark

	Bentely extends Car implements AutoPilot, AutoPark

	Cybertek extends Car implements AutoPilot, AutoPark, Swimmable, Flyable
 */