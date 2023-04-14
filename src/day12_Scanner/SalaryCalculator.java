package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your hourly rate: ");
        double hourlyRate = input.nextDouble();

        System.out.println("How many hours do you work in a week?");
        int weeklyHour = input.nextInt();

        System.out.println("How many weeks do you work in a year?");
        int weeks = input.nextInt();

        double salary = hourlyRate * weeklyHour * weeks;

        System.out.println("You are making $" + hourlyRate + " per hour");
        System.out.println("You work "+weeklyHour+" hours in a week");
        System.out.println("You work " + weeks + " weeks in a year");
        System.out.println("Your salary is " + salary);

    }

}
