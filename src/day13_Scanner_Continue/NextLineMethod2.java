package day13_Scanner_Continue;

import java.util.Scanner;

public class NextLineMethod2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//Enter

        System.out.println("Enter your age ");
        int age = input.nextInt();//input: 19EnterKey => 19 will assigned to age but EnterKey will go to Scanner

        input.nextLine();//to clear the Scanner


        System.out.println("Enter your job title");
        String jobTitle = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("jobTitle = " + jobTitle);
    }
}
