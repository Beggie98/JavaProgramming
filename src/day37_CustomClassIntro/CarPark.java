package day37_CustomClassIntro;

public class CarPark {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setInfo("Kia","K5", "White", 35000,2022);
        car1.getInfo();

        Car car2 = new Car();
        car2.make = "BMW";
        car2.model = "X7";
        car2.color = "Blue";
        car2.price = 150000;
        car2.year = 2021;
        car2.getInfo();

        Car car3 = new Car();
        car3.setInfo("Mercedes-Benz","AMG", "Black", 120000, 2019);
        car3.getInfo();

        car1.drive();
        car2.park();
        car3.fix("Engine");



    }
}
