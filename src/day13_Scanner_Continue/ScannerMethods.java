package day13_Scanner_Continue;

import java.util.Scanner;

public class ScannerMethods {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("You are full time employee: ");
        boolean isFullTime = input.nextBoolean();

        System.out.println("You are an adult: ");
        boolean isAdult = input.nextBoolean();

        System.out.println("You are married: ");
        boolean isMarried = input.nextBoolean();

        System.out.println("isFullTime = " + isFullTime);
        System.out.println("isAdult = " + isAdult);
        System.out.println("isMarried = " + isMarried);






    }
}
