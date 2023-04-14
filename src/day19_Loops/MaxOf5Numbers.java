package day19_Loops;

import java.util.Scanner;

public class MaxOf5Numbers {
    /*
    ask user to enter a number for 5 times,  then return the maximum number
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = -2147483648;//whatever user enters it will be larger than -2147483648
        System.out.println("Enter 5 numbers please");

        for (int i = 0; i < 5; i++) {//10, 20, 30, 40, 15
            int num = input.nextInt();

            if (num > max){//if the user entered number is greater than the max value
                max = num;//then user entered number will be assigned to max variable
            }

        }
        System.out.println("max = " + max);
        input.close();

    }
}
