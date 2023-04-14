package day52_Abstraction_Continue.carTask;

public final class Mercedes extends Car implements AutoPark{
    public Mercedes(String model, String color, int year, double price) {
        super("Mercedes", model, color, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " is auto-parking");
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
