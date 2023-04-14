package day52_Abstraction_Continue.carTask;

public final class Tesla extends Car implements AutoPilot, AutoPark{
    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
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
        System.out.println("Voice control");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " is driving");
    }
}
