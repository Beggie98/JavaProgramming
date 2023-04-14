package day15_String_Intro;

import java.util.Scanner;

public class NameFormatting {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.nextLine().trim();//bEKzoD
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();

        System.out.println(firstName);

        System.out.println("Enter your last name");
        String lastName = input.nextLine().trim();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(lastName);

        String fullName = firstName + " " + lastName;
        System.out.println("fullName = " + fullName);

    }
    /*
    ask the user to enter first name:
        1. make sure there is no white space
        2. Make sure first character is uppercase and rest of the characters need to be in lowercase

        input:
                                    bEKzod
     */
}
