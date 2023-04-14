package day20_Branching_Statements;

import java.util.Scanner;

public class SumOfNumbersUntilNegative {
    /*
     Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop
     */
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i <= 10;) {//for( ; ; ) - is also an infinite loop, but only works in JDK8
            System.out.println("Enter a number");
            int number = new Scanner(System.in).nextInt();
            if (number<0){//if user enters a negative number
                break;
            }
            sum += number;
        }
        System.out.println("sum = " + sum);
    }
}
