package day14_Java_Recap;

import java.util.Scanner;

public class ScannerPractice3 {
    /*
     - - Ask the user to enter the year, month number, and day they were born and print in the following format:
                "%month / day / year is your birthday "
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your year of birth");
        int yearOfBirth = input.nextInt();

        System.out.println("Enter your month of birth");
        int monthOfBirth = input.nextInt();

        System.out.println("Enter your day of birth");
        int dayOfBirth = input.nextInt();

        boolean isValid = (yearOfBirth > 0 && yearOfBirth <= 2023) && (monthOfBirth > 0 && monthOfBirth <=12) &&
                (dayOfBirth > 0 && dayOfBirth<=31);

        if (isValid){
            System.out.println(monthOfBirth + " / " + dayOfBirth + " / " + yearOfBirth + " is your birthday");
        }else{
            System.err.println("Invalid entries");
        }

        input.close();

    }
}
