package day15_String_Intro;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        double num1 = input.nextDouble();

        System.out.println("Enter the math operator");
        char mathOpertor = input.next().charAt(0);

        System.out.println("Enter second number");
        double num2 = input.nextDouble();
        
        double result = 0;

        switch (mathOpertor){
            case '-': result = num1 - num2;
            break;
            case '+': result = num1 + num2;
            break;
            case '*': result = num1 * num2;
            break;
            case '/': result = num1 / num2;
            break;
            default:
                System.err.println("Invalid operator");
        }
        System.out.println("result = " + result);
        input.close();

    }

}
/*

ask:
    1. num1
    2. math operator
    3. num2



ex: 10
    +
    20

output:
    30

 */