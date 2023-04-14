package day23_Arrays;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int size = input.nextInt();
        int[] numbers = new int[size];

        double sum = 0;
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }
        double average = sum / size;
        System.out.println(average);
        input.close();



    }
}
