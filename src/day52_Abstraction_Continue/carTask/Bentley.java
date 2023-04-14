package day52_Abstraction_Continue.carTask;

public final class Bentley extends Car implements AutoPark, AutoPilot{
    public Bentley(String model, String color, int year, double price) {
        super("Nio", model, color, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " is auto-parking");
    }

    @Override
    public void autoPilot() {
        System.out.println(getMake() + " " + getModel() + " is self-driving");
    }

    @Override
    public void start() {
        System.out.println("Twist the key");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " is driving");
    }
}
