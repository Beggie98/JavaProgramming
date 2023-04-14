package day13_Scanner_Continue;

import java.util.Scanner;

public class NextMethod {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//Jones Branch Drive
        System.out.println("Enter your name: ");
        String firstName = input.next(); // this method only takes the first word
        // for example: Conor McGregor
        //System.out.println("First name = " + firstName);//output: name = Conor

        System.out.println("Enter your last name:");
        String lastName = input.next();

        String fullName = firstName + " " + lastName;

        System.out.println("fullName = " + fullName);

        System.out.println("Enter your address");
        String address = input.next();

        System.out.println("address = " + address);
        /*
        input: 7925 Jones Branch Drive     =>     address input will take the first word "7925",
        the rest of the words will be saved in Scanner and
        the following next methods will take those words one by one in a consequitive order
                */

        String gender = input.next();//Jones
        String state = input.next();//Branch
        String city = input.next();//Drive

        System.out.println("gender = " + gender);
        System.out.println("state = " + state);
        System.out.println("city = " + city);

    }
}
