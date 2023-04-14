package day51_Abstraction.carTask;

public class ParkingLot {

    public static void main(String[] args) {
        Toyota toyota = new Toyota("Camry",2021,30000,"Red");
        Audi audi = new Audi("A8",2021,90000,"Black");
        Tesla tesla = new Tesla("Roadster",2022,180000,"Red");
        BMW bmw = new BMW("750",2020,70000,"Black");

        System.out.println(toyota);
        System.out.println(tesla);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println("---------------------------------");

        toyota.start();
        audi.start();
        tesla.start();
        bmw.start();

        System.out.println("-----------------------------------------");

        Car[] cars = {toyota, audi, bmw, tesla};


    }

}
