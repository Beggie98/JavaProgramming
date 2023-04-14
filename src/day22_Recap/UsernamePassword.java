package day22_Recap;

import java.util.Scanner;

public class UsernamePassword {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        do {
            System.out.println("Enter your username");
            String userName = input.next();
            System.out.println("Enter your password");
            String password = input.next();
            if (userName.equals("Bekzod") && password.equals("Juraev")){
                System.out.println("You logged in");
                break;
            }
        }while (true);

         */
        String userName = "";
        String password = "";
        int attempts = 0;
        do {
            System.out.println("Enter your username");
            userName = input.next();
            System.out.println("Enter your password");
            password = input.next();


            if (attempts==3){
                System.err.println("Your account is locked");
                System.exit(0);
            }

                attempts++;

        }while (!(userName.equals("Bekzod") && password.equals("Juraev")));//repeat until the credentials entered are correct

        System.out.println("Logged in");

        input.close();

    }
}
