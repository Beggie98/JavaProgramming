package day22_Recap;

import java.util.Scanner;

public class MarriageProposal {
    /*
    write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is neither yes nor no, print "Invalid answer,
     please re-enter" and repeat it until the user enters either yes or no
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String answer = "";

        System.out.println("Will you marry me?");
        answer = input.next();

        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
            System.out.println("Invalid answer, please re-enter");
            answer = input.next();
        }
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Congrats");
            } else if (answer.equalsIgnoreCase("no")) {
                System.out.println("Sorry to hear that");
            }
            input.close();
        }


    }

