package day12_Scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        //Scanner variableName = new Scanner(System.in);//variableName - any name
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();

        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;
        System.out.println("addition = " + addition);
        System.out.println("subtraction = " + subtraction);
        System.out.println("multiplication = " + multiplication);
        System.out.println("division = " + division);


    }
}
