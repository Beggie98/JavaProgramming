package day52_Abstraction_Continue.carTask;

import day52_Abstraction_Continue.animalTask.Flyable;
import day52_Abstraction_Continue.animalTask.Swimmable;

public final class Cybertek extends Car implements AutoPilot, AutoPark, Flyable, Swimmable {
    public Cybertek(String model, String color, int year, double price) {
        super("Cybertek", model, color, year, price);
    }

    @Override
    public void fly() {
        System.out.println(getMake() + " " + getModel() + " is flying");
    }

    @Override
    public void swim() {
        System.out.println(getMake() + " " + getModel() + " is swimming");
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

    }
}
