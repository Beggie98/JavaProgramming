package day13_Scanner_Continue;

import java.util.Scanner;

public class ShippingInfo {
    /*
    hippingInfo
	ask the followings:
		1. Builder Number (nextInt)
		2. Street Address (nextLine)
		3. City Name  (nextLine)
		4. State ( next )
		5. Zip Code (next)
		6. Full Name

	print the shipping info of the person

	Ex:
		Aysu Ahmadil
		7925 Jones Branch Drive
		Mclean, VA 22012
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your building number");
        int buildingNumber = input.nextInt();

        input.nextLine();

        System.out.println("Enter your street address");
        String streetName = input.nextLine();

        System.out.println("Enter your city name");
        String cityName = input.nextLine();

        System.out.println("Enter your state");
        String stateName = input.next();

        System.out.println("Enter your zipcode");
        String zipcode = input.next();

        input.nextLine();

        System.out.println("Enter your Full Name");
        String fullName = input.nextLine();

        System.out.println(fullName);
        System.out.println(buildingNumber + " " + streetName);
        System.out.println(cityName + ", " + stateName + " " + zipcode);

    }
}
