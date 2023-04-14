package basics;

import java.util.Scanner;

public class PrintVariable5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int first = input.nextInt();
        int second = input.nextInt();

        System.out.println("First is " + first + ", second is " + second);
        input.close();
    }
}
