package day53_Abstraction_and_Polymorphism.carTask;

public class Nio extends Car implements Chargeable, AutoPilot{
    public Nio(String model, String color, int year, double price) {
        super("Nio", model, color, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println("Auto-parking " + getMake() + " " + getModel());
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " " + getModel() + " is self-driving");
    }

    @Override
    public void start() {
        System.out.println("Starting " + getMake() + " " + getModel());
    }

    @Override
    public void drive() {
        System.out.println("Driving " + getMake() + " " + getModel());
    }

    @Override
    public void charging() {
        System.out.println("Charging " + getMake() + " " + getModel());
    }
}
