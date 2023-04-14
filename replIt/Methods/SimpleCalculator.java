package Methods;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        plus();
    }


    public static void plus(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = input.nextInt();
        System.out.println("Enter second number");
        int b = input.nextInt();

        System.out.println("Addition: " + (a+b));
        input.close();

    }

}
