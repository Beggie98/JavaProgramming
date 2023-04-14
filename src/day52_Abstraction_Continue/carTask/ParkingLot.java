package day52_Abstraction_Continue.carTask;

public class ParkingLot {
    public static void main(String[] args) {
        Toyota toyota = new Toyota("Camry","White",2021,70000);
        System.out.println(toyota);
        toyota.start();
        toyota.drive();

        System.out.println("--------------------------------------------------------");

        Cybertek cybertek = new Cybertek("A23","Blue",2023,50000);
        System.out.println(cybertek);
        cybertek.start();
        cybertek.drive();
        cybertek.autoPark();
        cybertek.autoPilot();
        cybertek.swim();
        cybertek.fly();
    }
}
