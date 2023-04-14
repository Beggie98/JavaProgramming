package Statements;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for x");
        int x = input.nextInt();

        String result = (x>=5)? "x" : "-x";

        System.out.println(result);
    }
}
