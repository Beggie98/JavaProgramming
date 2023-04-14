package Statements;

import java.util.Scanner;

public class RealEstateCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your property type:");
        String propertyType = input.nextLine();

        int totalCost = 0;

        if (propertyType.equalsIgnoreCase("condo")){
            totalCost += 50000;
        } else if (propertyType.equalsIgnoreCase("Townhouse")) {
            totalCost += 75000;
        }else if (propertyType.equalsIgnoreCase("Single Family Home")){
            totalCost += 95000;
        }else {
            System.out.println("Invalid entry");
        }

        System.out.println();

        System.out.println("How many bedrooms do you have?");
        int numberOfBedrooms = input.nextInt();

        totalCost += numberOfBedrooms * 30000;

        System.out.println("Do you have a backyard");
        boolean hasBackyard = input.nextBoolean();
        if (hasBackyard) {
            if (propertyType.equalsIgnoreCase("Condo")) {
                System.out.println("Backyard is not available for condo!");
            } else {
                totalCost += 5000;
            }
        }else {
            System.out.println("No backyard");
        }

        System.out.println();

        System.out.println("Do you have a garage?");
        boolean hasGarage = input.nextBoolean();
        if (hasGarage){
            System.out.println("How many spots do you need?");
            int numberOfSports = input.nextInt();
            if (numberOfSports > 0) {
                if (numberOfSports > 10) {
                    System.out.println("Pardon, it's not public parking!");
                } else {
                    totalCost += numberOfSports * 20000;
                }
            }else {
                System.out.println("Invalid entry");
            }
        }

        System.out.println();

        System.out.println("How close is metro station?");
        double milesToMetro = input.nextDouble();
        if (milesToMetro >= 0){
            if (milesToMetro <= 1){
                totalCost += 10000;
            }else if (milesToMetro > 1 && milesToMetro <= 3){
                totalCost += 5000;
            }
        }else {
            System.out.println("Invalid entry");
        }

        System.out.println();


        System.out.println("How close is highway?");
        double milesToHighway = input.nextDouble();
        if (milesToHighway >= 0){
            if (milesToHighway <= 1){
                totalCost += 15000;
            }else if (milesToHighway > 1 && milesToHighway <= 5){
                totalCost += 8000;
            }else if (milesToHighway > 5 && milesToHighway <= 20){
                totalCost += 4000;
            }
        }else {
            System.out.println("Invalid entry");
        }

        System.out.println();

        System.out.println("What's the rating of nearest school?");
        double schoolRating = input.nextDouble();
        if (schoolRating>0){
            if (schoolRating <= 10 && schoolRating >= 8){
                totalCost += 45000;
            }else if (schoolRating < 8 && schoolRating >=4){
                totalCost += 20000;
            }else {
                totalCost += 5000;
            }
        }else {
            System.out.println("Invalid entry");
        }

        System.out.println();

        System.out.println("Does any of your family members smoke?");
        boolean doesSmoke = input.nextBoolean();

        if (doesSmoke){
            totalCost -= 5000;
        }
        System.out.println();
        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: $" + totalCost);




    }
}
