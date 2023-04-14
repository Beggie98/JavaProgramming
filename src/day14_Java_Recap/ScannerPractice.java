package day14_Java_Recap;

import java.util.Scanner;

public class ScannerPractice {
    /*
    Scanner:
        - - Ask the user to enter their height (double), shoe size (int),
        and if they like to wear hats (boolean). Print out the information

        - - Ask the user to enter the year, month number, and day they were born
        and print in the following format:
                "%month / day / year is your birthday "

        - - Ask the user to enter their zipcode (long), the number of people they live with (byte),
        if they are married or not (boolean - true for married/false for not)
        and print the values in the following format:

            Ex:
                inputs: 31009, 4, false

                output:
                     I see you are not married and live with 4 people in your house which is in the 31009 area!
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your height");
        double height = input.nextDouble();

        System.out.println("Enter your shoe size");
        int shoeSize = input.nextInt();

        System.out.println("Do you like to wear a hat?");
        boolean wearHat = input.nextBoolean();

        if ((height>0 && height < 300) && (shoeSize>0 && shoeSize<60)) {
            System.out.println("Your height is " + height + "\nYour shoe size is " + shoeSize
                    + "\nYou wear hats: " + wearHat);
        }else{
            System.err.println("Invalid entries");
        }


    }



}
