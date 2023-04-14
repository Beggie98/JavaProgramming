package day13_Scanner_Continue;

import java.util.Scanner;

public class FreeShippinng {
    /*
        FreeShipping:
            price
            isPrime:
                true: free shipping
                false: $3.99 shipping fee

         */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the price");
        double price = input.nextDouble();

        System.out.println("Are you a prime member?");
        boolean isPrime = input.nextBoolean();

        double totalCost = (isPrime)? price :(price >= 25)? price : (price + 3.99);
        //                  (isPrime || price>=25)? price : price + 3.99

        System.out.println("Total Price = $" + totalCost);


    }
}
