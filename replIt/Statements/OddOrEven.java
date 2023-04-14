package Statements;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = input.nextInt();

        String result = (number%2==0)? (number + " is even") : (number + " is odd");
        System.out.println(result);

    }
}
