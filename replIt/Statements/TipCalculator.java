package Statements;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split or No Split");
        String split = input.next();

        System.out.println("Number of people entered:");
        int numberOfPeople = input.nextInt();

        System.out.println("Check amount:");
        double checkAmount = input.nextDouble();

        System.out.println("Service quality:");
        String serviceQuality = input.next();

        int numberOfPeople1 = numberOfPeople;
        if (!split.equalsIgnoreCase("Yes")){
            numberOfPeople1 = 1;
        }

        double totalTip = 0;
        if (serviceQuality.equalsIgnoreCase("Poor")){
            totalTip = checkAmount * 0.05;
        } else if (serviceQuality.equalsIgnoreCase("Fair")) {
            totalTip = checkAmount * 0.1;
        }else if (serviceQuality.equalsIgnoreCase("Good")){
            totalTip = checkAmount * 0.15;
        } else if (serviceQuality.equalsIgnoreCase("Great")) {
            totalTip = checkAmount * 0.20;
        } else if (serviceQuality.equalsIgnoreCase("Excellent")) {
            totalTip = checkAmount * 0.25;
        }else {
            System.out.println("Invalid input");
        }

        System.out.println("Number of people entered: " + numberOfPeople);
        System.out.println("Total to pay: " + (checkAmount + totalTip));
        System.out.println("Total tip: " + totalTip);
        System.out.println("Total per person: " + ((checkAmount + totalTip) / numberOfPeople1));
        System.out.println("Tip per person: " + (totalTip / numberOfPeople1));


    }
}
