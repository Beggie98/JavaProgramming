package day46_OOP_Inheritance_Continue.carTask;

public class CarShop {

    public static void main(String[] args) {
        Toyota toyota = new Toyota("Camry",2020,50000,"White",200000);
        toyota.start();

        System.out.println("------------------------------------------------------------");

        Tesla tesla = new Tesla("S",2021,120000,"Black",0);
        tesla.start();

        System.out.println("--------------------------------------------------------");

        BMW bmw = new BMW("X6",2015,100000,"Red",5000);
        bmw.start();

        System.out.println("--------------------------------------------------------");
    }


}
