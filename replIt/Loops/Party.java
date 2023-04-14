package Loops;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = "";
        String names = "";
        do {
            System.out.println("Please enter guest name: ");
            String name = input.next();
            names += name + " ";
            System.out.println("Do you want to enter new guest name?");
            word = input.next();
        }while(word.equalsIgnoreCase("yes"));


        System.out.println("Guests' list: " + names);
    }
}
