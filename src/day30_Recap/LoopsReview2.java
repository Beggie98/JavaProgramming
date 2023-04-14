package day30_Recap;

import java.util.Scanner;

public class LoopsReview2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer = "";
        int n = 0;

        while (!answer.equals("no")){
            System.out.println("Enter a number: ");
            n = input.nextInt();
            System.out.println("Would you like to enter another number");
            answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))){
                System.out.println("Invalid Answer! Would you like to enter another number");
                answer = input.next();
            }

        }



    }
}
