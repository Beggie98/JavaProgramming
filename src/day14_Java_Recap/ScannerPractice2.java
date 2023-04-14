package day14_Java_Recap;

import java.util.Scanner;

public class ScannerPractice2 {
/*
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

        System.out.println("Enter the zipcode");
        long zipcode = input.nextLong();

        System.out.println("How many people do you live with?");
        byte numberOfPeople = input.nextByte();

        System.out.println("Are you married?");
        boolean isMarried = input.nextBoolean();

        if (zipcode > 0 && numberOfPeople > 0){
            System.out.println("I see you are" + ((isMarried==true)? " married" : " not married")
            + " and live with " + numberOfPeople + " people in your house which is in the " + zipcode + " area!");
        }else {
            System.out.println("Invalid entries");
        }

        input.close();


    }
}
