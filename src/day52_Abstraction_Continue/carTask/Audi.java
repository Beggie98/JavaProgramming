package day52_Abstraction_Continue.carTask;

public final class Audi extends Car implements AutoPark{
    public Audi(String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " is auto-parking");
    }

    @Override
    public void start() {
        System.out.println("Press the start button");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " is driving");
    }
}
