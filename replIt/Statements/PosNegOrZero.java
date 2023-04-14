package Statements;

import java.util.Scanner;

public class PosNegOrZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num = input.nextInt();

        String result = (num<0)? "Negative" :(num>0)? "Positive" : "Zero";
        System.out.println(result);

        input.close();

    }
}
