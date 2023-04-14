package day19_Loops;

import java.util.Scanner;

public class SumOf10Numbers {
    /*
    ask user to enter a number 10 times . find the sum of 10 numbers
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            int num = input.nextInt();
            sum += num;
        }
        System.out.println("sum = " + sum);
        input.close();
    }
}
