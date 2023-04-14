package OOP.lameCalculatorTask;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        LameCalculator lc = new LameCalculator();
        System.out.println(lc.plus(num1,num2));
        System.out.println(lc.minus(num1,num2));
        System.out.println(lc.multiply(num1,num2));
        System.out.println(lc.divide(num1,num2));

        input.close();

    }

}
