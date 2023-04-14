package day28_Methods;

import java.util.Scanner;

public class VoidMethodsPractice {


    public static void oddNumbers(int from, int to){
        for (int i = from; i <= to ; i++) {
            if (i%2!=0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void evenNumbers(int from, int to){
        for (int i = from; i <= to ; i++) {
            if (i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void calculateTheAge(int birthYear, int currentYear){
        System.out.println("Your age is: " + (currentYear - birthYear));
    }

    public static void eligibletoVote(int age, boolean isUSCitizen){
        if (age >= 21 && isUSCitizen){
            System.out.println("Eligible to Vote");
        }else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void calculate(int num1, int num2, char operator){
        switch (operator){
            case '+':
                System.out.println("Addition: " + num1 + num2);
                break;
            case '-':
                System.out.println("Subtraction: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Multiplication: " + (num1 * num2));
                break;
            case '%':
                System.out.println("Remainder: " + (num1 % num2));
                break;
            default:
                System.out.println("Invalid input");
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        oddNumbers(1,100);
        System.out.println("--------------------------------------------------------------------");
        evenNumbers(input.nextInt(), input.nextInt());
        System.out.println("--------------------------------------------------------------------");
        eligibletoVote(30, false);
        System.out.println("--------------------------------------------------------------------");
        calculateTheAge(1998,2023);
        System.out.println("--------------------------------------------------------------------");
        calculate(100,200,'+');
    }
/*
1. create a method that can print odd numbers between 1~100 in a same line seperated by space

	2. create a method that can print even numbers between 1~100

	3. create a method that can calculate the age of the person

	4. check eligibility to vote
 */

}
