package day13_Scanner_Continue;

import java.util.Scanner;

public class PersonalInformation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//EnterEnter

        System.out.println("Enter your salary");
        double salary = input.nextDouble();//input: 100000Enter

        System.out.println("Enter your gender");
        String gender = input.next();//one word only, input: MaleEnter

        input.nextLine();//EnterEnter - this nextline method cleans the Scanner memory


        System.out.println("Enter you full name");
        String fullName = input.nextLine();//more than one word

        System.out.println("Enter job title");
        String jobTitle = input.nextLine();//no cleaning needed if nextline method comes after nextline method


        System.out.println("salary = " + salary);
        System.out.println("gender = " + gender);
        System.out.println("fullName = " + fullName);
        System.out.println("jobTitle = " + jobTitle);
    }
}
