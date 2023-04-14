package day17_String_Continue;

import java.util.Scanner;

public class Initial2 {
/*
Enter
 */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = input.nextLine();//Cybertek School

        String firstName = fullName.substring(0,fullName.indexOf(" "));//Cybertek
        String lastName = fullName.substring(fullName.indexOf(" ")+1);//School

        String initials = firstName.substring(0,1).toUpperCase() + "." + lastName.substring(0,1).toUpperCase();
        System.out.println();
        input.close();

    }


}
