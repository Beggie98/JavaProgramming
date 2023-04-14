package day51_Abstraction.carTask;

public final class Audi extends Car{

    public Audi(String model, int year, double price, String color) {
        super("Audi", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Push the start button");
    }
}
