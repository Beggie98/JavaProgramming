package day17_String_Continue;

import java.util.Scanner;

public class StringPractice2 {
    /*
    write a program that can return the initials of the user
	            ex:
	                cybertek
	                school
	            output:
	                C.S
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your first name");
        String lastName = input.next();
        /* First way
        create substrings for first characters of first name and last name, then called toUpperCase
        String initial1 = firstName.substring(0,1).toUpperCase();
        String initial2 = lastName.substring(0,1).toUpperCase();
        System.out.println(initial1 + "." + initial2);
         */

        /*Second way
        String initials = firstName.charAt(0) + "." + lastName.charAt(0);
        initials = initials.toUpperCase();

        System.out.println(initials);
         */

        /*Third way
        String initials = firstName.toUpperCase().charAt(0) + "." + lastName.toUpperCase().charAt(0);

        System.out.println("initials = " + initials);

         */


        input.close();


    }
}
