package Statements;

import java.util.Scanner;

public class LaptopConfigurator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int laptopPrice = 0;

        System.out.println("Select screen size:");
        double screenSize = input.nextDouble();

        if (screenSize == 13.3){
            laptopPrice += 200;
        }else if (screenSize == 15){
            laptopPrice += 300;
        }else if (screenSize == 17.3){
            laptopPrice += 400;
        }else {
            System.out.println("No such screen size");
        }

        System.out.println("Select CPU type:");
        String cpuType = input.next();
        if (cpuType.equalsIgnoreCase("i3")){
            laptopPrice += 150;
        }else if (cpuType.equalsIgnoreCase("i5")){
            laptopPrice += 250;
        } else if (cpuType.equalsIgnoreCase("i7")) {
            laptopPrice += 350;
        }else {
            System.out.println("No such CPU type");
        }

        System.out.println("Select RAM size:");
        int ramSize = input.nextInt();

            laptopPrice += (ramSize/4)*50;


        System.out.println("Select storage type:");
        String storageType = input.next();
        System.out.println("Enter memory size:");
        int memorySize = input.nextInt();

        if (storageType.equalsIgnoreCase("HDD")){
            laptopPrice += (memorySize/500)*50;
        } else if (storageType.equalsIgnoreCase("SSD")) {
            laptopPrice += (memorySize/500)*100;
        }else {
            System.out.println("No such storage type");
        }

        System.out.println("Select screen resolution:");
        String screenResolution = input.next();

        if (screenResolution.equalsIgnoreCase("FULLHD")){
            laptopPrice += 100;
        } else if (screenResolution.equalsIgnoreCase("4K")) {
            laptopPrice += 200;
        }

        System.out.println("Laptop price is: $" + laptopPrice);

    }
}
