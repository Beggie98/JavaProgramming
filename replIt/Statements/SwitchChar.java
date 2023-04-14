package Statements;

import java.util.Scanner;

public class SwitchChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter command:");
        char command = input.next().charAt(0);

        String result = "";


        switch (command){
            case 'y': result = "Your request is being processed";
            break;
            case 'n': result = "Thank you anyway for your consideration";
            break;
            case 'h': result = "Sorry, no help is currently available";
            break;
            default: result = "Invalid entry, please try again!";
        }
        System.out.println(result);
    }
}
