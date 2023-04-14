package Variables;

import java.util.Scanner;

public class PatientInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the patient portal!\n Please enter your personal information");

        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();

        System.out.println("Enter your email");
        String emailAddress = input.next();

        input.nextLine();

        System.out.println("Enter your street");
        String streetAddress = input.nextLine();

        System.out.println("Enter your city");
        String city = input.nextLine();

        System.out.println("Enter your state");
        String state = input.next();

        System.out.println("Enter your zipcode");
        int zipcode = input.nextInt();

        System.out.println("Enter your work phone number");
        long workPhoneNumber = input.nextLong();

        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = input.nextLong();

        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.println("Enter your height");
        double height = input.nextDouble();

        System.out.println("Enter your weight");
        double weight = input.nextDouble();

        System.out.println("Are you married?");
        boolean isMarried = input.nextBoolean();

        String contacts = "work phone number - " + workPhoneNumber + ", personal phone number - "
                + personalPhoneNumber + ", email: " + emailAddress;

        String fullName = firstName + ", " + lastName;

        String address = streetAddress + ", " + city + ", " + state + " " + zipcode;

        System.out.println("Patient personal information");
        System.out.println("Full name: " + fullName);
        System.out.println("Address: " + address);
        System.out.println("Contacts: " + contacts);
        System.out.println("Age: " + age + "\nHeight: " + height + "\nWeight: "
                + weight + " pounds\nMarried?:" + isMarried);



    }
}
