package day37_CustomClassIntro;

public class Car {
    public String make;
    public String model;
    public String color;
    public double price;
    public int year;

    public void setInfo(String carMake, String carModel, String carColor, double carPrice, int carYear){
        make = carMake;
        model = carModel;
        color = carColor;
        price = carPrice;
        year = carYear;
    }

    public void getInfo(){
        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("color = " + color);
        System.out.println("price = $" + price);
        System.out.println("year = " + year);
    }

    public void drive() {
        System.out.println(make + " is being driven");
    }

    public void park(){
        System.out.println(make + " is being parked");
    }

    public void fix(String part){
        System.out.println(make + "'s " + part + " is being fixed");
    }

}
