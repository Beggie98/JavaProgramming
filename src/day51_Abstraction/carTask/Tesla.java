package day51_Abstraction.carTask;

public final class Tesla extends Car{

    public Tesla(String model, int year,  double price, String color) {
        super("Tesla", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Voice control");
    }

    public void autoPilot(){
        System.out.println("Tesla " + getModel() + " is self driving");
    }

}
