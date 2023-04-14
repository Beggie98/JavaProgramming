package Statements;

import java.util.Scanner;

public class VideoGameCoupons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of coupons");
        int numberOfCoupons = input.nextInt();

        int candy = numberOfCoupons / 10;
        int gumball = (numberOfCoupons % 10) / 3;
        int remainder = (numberOfCoupons % 10) % 3;

        System.out.println("Number of candies: " + candy);
        System.out.println("Number of gumballs: " + gumball);
        System.out.println("Number of coupons remained: " + remainder);

    }
}
