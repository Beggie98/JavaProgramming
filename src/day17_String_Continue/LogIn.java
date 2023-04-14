package day17_String_Continue;

import java.util.Scanner;

public class LogIn {
    /*
    Ask the user to enter username and password, and username can be typed either in lowercase or uppercase.
    Still, the password must be exact to log in. write a program to check
    if the user entered username & passwords match with the saved username & password in the database.
    If it's, then print "Logged in successfully". Otherwise, print "Invalid username or password."

			Assume that your username & password in the database are:
									Cybertek@gmail.com
									Cybertek123
			Ex:
				username: CYBERTEK@Gmail.com
				password: Cybertek123

				output:
					Logged in successfully
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String correctUserName = "Cybertek@gmail.com";
        String correctPassword = "Cybertek123";

        System.out.println("Enter your username");
        String userName = input.next();

        System.out.println("Enter your password");
        String password = input.next();

        boolean canLogIn = userName.equalsIgnoreCase(correctUserName) && password.equals(correctPassword);
        String result = "";

        if (canLogIn){
            result = "Logged in Successfully";
        }else{
            result = "Username or password provided is not correct";
        }
        System.out.println(result);
        input.close();

    }


}
