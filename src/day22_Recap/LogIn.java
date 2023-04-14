package day22_Recap;

import java.util.Scanner;

public class LogIn {
    /*
    1. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
						username: cybertek
				    	password: cybertek12345

	    Ask the user to enter their credentials.
	    		If credentials are matched, your program should print "Logged in."
	    		If the credentials are not matched, the program should allow the user to have three attempts to enter
	    		correct credentials and if all three attempts are failed, then print "Your account is lucked."
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = 0;
        while (i<4){
            System.out.println("Enter username");
            String userName = input.next();
            System.out.println("Enter password");
            String password = input.next();

            if (userName.equals("cybertek") && password.equals("cybertek12345")){
                System.out.println("Logged in\nHello Cybertek!");
                break;
            }else if (i==3){
                System.out.println("Your account is locked");
            }else {
                System.out.println("Try again\n--------------------------");
            }
            i++;
        }

        input.close();

    }
}
