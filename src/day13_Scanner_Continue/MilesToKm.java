package day13_Scanner_Continue;

import java.util.Scanner;

public class MilesToKm {
/*
 Write a program thta can convert Miles to KM
			1 mile = 1.609 km
			Ex:
				Enter miles:
				10.0

				output:
				16.09 kilometers
 */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter miles:");
        double miles = input.nextDouble();

        double kilometers = miles * 1.609;

        System.out.println(miles + " miles is equal to " + kilometers + " kilometers");
    }

}
