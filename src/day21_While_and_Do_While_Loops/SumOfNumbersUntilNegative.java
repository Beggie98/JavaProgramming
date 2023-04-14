package day21_While_and_Do_While_Loops;

import java.util.Scanner;

public class SumOfNumbersUntilNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.println("Enter a number");
            int n = input.nextInt();

            if (n<0){
                break;
            }
            sum += n;

        }
        System.out.println("sum = " + sum);
        input.close();
    }
}
