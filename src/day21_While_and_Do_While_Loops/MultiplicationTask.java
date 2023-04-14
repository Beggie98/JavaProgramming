package day21_While_and_Do_While_Loops;

import java.util.Scanner;

public class MultiplicationTask {
    //write a program that can multiply two positive numbers without using * operator
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = input.nextInt();
        System.out.println("Enter second number");
        int num2 = input.nextInt();
        int multiplication = 0;


        for (int i = 0; i < num2; i++) {
            multiplication += num1;
        }

        System.out.println("multiplication = " + multiplication);
        input.close();
    }
}
