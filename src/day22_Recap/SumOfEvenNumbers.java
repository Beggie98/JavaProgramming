package day22_Recap;

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int limit = input.nextInt();
        int sum = 0;
        int i = 0;

        do {
            if (i%2==0){
                sum += i;
            }
            i++;
        }while (i<=limit);

        System.out.println("sum = " + sum);

        input.close();
    }
}
