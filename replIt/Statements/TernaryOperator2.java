package Statements;

import java.util.Scanner;

public class TernaryOperator2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = input.nextInt();
        System.out.println("Enter second number");
        int num2 = input.nextInt();
        String result = "";

        if (num1 > num2){
            result = num1 + " is bigger";
        }else if (num2 > num1){
            result = num2 + " is bigger";
        }else {
            result = "Numbers are equal";
        }
        System.out.println(result);
        input.close();
    }
}
