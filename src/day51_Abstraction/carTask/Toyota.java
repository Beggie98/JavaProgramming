package day51_Abstraction.carTask;

public final class Toyota extends Car {

    public Toyota(String model, int year, double price, String color) {
        super("Toyota", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Twist the key");
    }
}
