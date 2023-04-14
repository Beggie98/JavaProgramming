package day14_Java_Recap;

import java.util.Scanner;

public class PlaceAnOrder {
    /*
    1. PlaceAnOrder task:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the product name");
        String productName = input.nextLine();

        System.out.println("Enter the price");
        double price = input.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = input.nextInt();

        input.nextLine();

        System.out.println("Enter your full name");
        String fullName = input.nextLine();
        input.close();//for closing the scanner to improve the performance

        double totalCost = quantity * price;

        System.out.println(fullName + ", your order for " + quantity + " " + productName
                + " has been placed. Your total is $" + totalCost +".");

//        System.out.println("Enter your age");
//        int age = input.nextInt();//will not be running as the Scanner is closed
//
//        System.out.println("age = " + age);
        // A new Scanner method can be recreated tho
    }
}
