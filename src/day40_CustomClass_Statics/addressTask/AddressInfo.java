package day40_CustomClass_Statics.addressTask;

import java.util.Scanner;

public class AddressInfo {
    public static void main(String[] args) {
        Address address1 = new Address();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your building number");
        int building = input.nextInt();

        input.nextLine();

        System.out.println("Enter your street name");
        String street = input.nextLine();

        System.out.println("Enter your city name");
        String city = input.nextLine();

        System.out.println("Enter your state");
        String state = input.next();

        System.out.println("Enter your zipcode");
        int zipcode = input.nextInt();

        address1.setInfo(building,street,city,state,zipcode);
        System.out.println(address1);
        input.close();
    }
}
/*
Attributes:
			instance:  buidlingNumber, street, city, state, zipCode
			static: country

		Actions
			setInfo: sets all the instances
			toString: returns the address
						EX:
							7925 Jones Branch Dr
							McLean Va, 22012

 */