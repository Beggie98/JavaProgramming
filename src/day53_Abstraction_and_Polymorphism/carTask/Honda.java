package day53_Abstraction_and_Polymorphism.carTask;

public class Honda extends Car{
    public Honda(String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("String " + getMake()  + " " + getModel() );
    }

    @Override
    public void drive() {
        System.out.println("Driving " + getMake()  + " " + getModel());
    }
}
