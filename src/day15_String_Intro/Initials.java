package day15_String_Intro;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        //String firstName = input.next();
        char ch1 = input.next().charAt(0);

        System.out.println("Enter your last name");
        //String lastName = input.next();
        char ch2 = input.next().charAt(0);
        /*
        char ch1 = firstName.charAt(0);
        char ch2 = lastName.charAt(0);
        input.close();

         */

        System.out.println(ch1 + "." + ch2);

    }
}
/*
Ask user to enter:
        1. first name
        2. last name
then print tge initials

ex: Daniel Jones

Initials: D.J

 */