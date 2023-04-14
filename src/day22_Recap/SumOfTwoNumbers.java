package day22_Recap;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        /*
        write a program that will ask user to enter 2 numbers and calculates the sum of those 2 numbers, then
        it asks the user if he/she wants to continue
                            if the answer is yes, repeat the whole process again
         */

        Scanner input = new Scanner(System.in);
        String answer = "";
        do {
            System.out.println("Enter first number");
            int num1 = input.nextInt();
            System.out.println("Enter second number");
            int num2 = input.nextInt();
            int sum = num1 + num2;
            System.out.println("sum = " + sum);
            System.out.println("Would you like to continue?");
            answer = input.next();
            while (!(answer.equalsIgnoreCase("No")||answer.equalsIgnoreCase("Yes"))){
                System.out.println("Invalid answer, please re-enter");
                System.out.println("Would you like to continue?");
                answer = input.next();
            }

        }while(answer.equalsIgnoreCase("Yes"));

        input.close();
    }
}
