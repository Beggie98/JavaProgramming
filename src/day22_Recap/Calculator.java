package day22_Recap;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        char operator;
        String answer = "";

        while (!answer.equalsIgnoreCase("no")){// if the answer is not NO
            System.out.println("Please enter 2 numbers:");
            num1 = input.nextInt();
            num2 = input.nextInt();

            System.out.println("Enter a math operator:");
            operator = input.next().charAt(0);

            if (operator == '-'){
                System.out.println("Subtraction: " + (num1 - num2));
            } else if (operator == '+') {
                System.out.println("Addition: " + (num1 + num2));
            }else if (operator == '*'){
                System.out.println("Multiplication: " + (num1 * num2));
            }else if (operator == '/'){
                System.out.println("Division: " + (num1 / num2));
            }else {
                System.out.println("Invalid operator");
            }

            System.out.println("Would you like to continue?");
            answer = input.next();

            while (!(answer.equalsIgnoreCase("yes") || (answer.equalsIgnoreCase("no")))) {
                System.out.println("Invalid entry, please re-enter");
                System.out.println("Would you like to continue?");
                answer = input.next();
            }
        }



    }
}
