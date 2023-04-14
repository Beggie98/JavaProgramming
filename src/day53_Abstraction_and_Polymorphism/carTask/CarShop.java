package day53_Abstraction_and_Polymorphism.carTask;

public class CarShop {

    public static void main(String[] args) {
        Honda honda = new Honda("Civic","dark blue",2018,19500);
        System.out.println(honda);
        honda.drive();
        honda.start();

        System.out.println("----------------------------------------------------------");

        Ford ford = new Ford("Mustang","black",2019,25800);
        System.out.println(ford);
        ford.drive();
        ford.start();

        System.out.println("-----------------------------------------------------------");
        Porsche porsche = new Porsche("Cayman","red",2017,68000);
        System.out.println(porsche);
        porsche.drive();
        porsche.start();
        porsche.autoPark();

        System.out.println("-------------------------------------------------------------");

        Audi audi = new Audi("A8","White",2020,83400);
        System.out.println(audi);
        audi.drive();
        audi.start();
        audi.autoPark();

        System.out.println("----------------------------------------------------");

        Tesla tesla = new Tesla("S","blue",2021,120000);
        System.out.println(tesla);
        tesla.drive();
        tesla.start();
        tesla.autoPark();
        tesla.charging();
        tesla.selfDrive();

        System.out.println("-----------------------------------------------------");

        Nio nio = new Nio("ET7","White",2020,68000);
        System.out.println(nio);
        nio.drive();
        nio.start();
        nio.autoPark();
        nio.charging();
        nio.selfDrive();

        Car[] cars = {honda, ford, audi, porsche, tesla, nio};

    }

}
