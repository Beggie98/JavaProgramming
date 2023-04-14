package Variables;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 number:");
        int num1 = input.nextInt(),
            num2 = input.nextInt(),
            num3 = input.nextInt(),
            sum = num1 + num2 + num3;

        System.out.println("Sum of numbers: " + sum);
        input.close();
    }
}
