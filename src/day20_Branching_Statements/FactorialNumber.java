package day20_Branching_Statements;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        System.out.println("Enter a number for factorial");
        int number = new Scanner(System.in).nextInt();

        int num = 1;

        for (int i = number; i > 0 ; i--) {
            num *= i;
        }
        System.out.println(number + "! = " + num);
    }
}
