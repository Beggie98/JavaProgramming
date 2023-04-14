package day13_Scanner_Continue;

import java.util.Scanner;

public class NextLineMethod {
    public static void main(String[] args) {

        /*Scanner input = new Scanner(System.in);//Master

        System.out.println("Enter your job title:");
        String jobTitle = input.next();
        //input: Scrum Master - more than one word
        System.out.println("Enter your gender");
        String gender = input.next();

        System.out.println("jobTitle = " + jobTitle);//Scrum
        System.out.println("gender = " + gender);//Master: automatically assigned
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your job title: ");
        String jobTitle = input.nextLine();

        System.out.println("jobTitle = " + jobTitle);
    }
}
