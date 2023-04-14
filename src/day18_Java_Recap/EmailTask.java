package day18_Java_Recap;

import java.util.Scanner;

public class EmailTask {
    /*
    1. EmailTask1:
			Assume that email address is constructed by person's first name and followed by an underscore
			and last name.
			Write a program that can swap first name with last name in the email
			(Seperated by an underscore). If the email doesn't contain an underscore print the given input email.

			Ex:
				input: mike_tyson@gmail.com
				output: tyson_mike@gmail.com
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an email");
        String email = input.next();

        email = email.substring(email.indexOf("_")+1,email.indexOf("@")) + "_"+ email.substring(0,email.indexOf("_"))
                + email.substring(email.indexOf("@"));

        System.out.println(email);
        input.close();
    }
}
