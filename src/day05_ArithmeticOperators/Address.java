package day05_ArithmeticOperators;

public class Address {

    public static void main(String[] args) {
        String name = "Daniel Owens",
                streetName = "Jones Branch Dr",
                city = "McLean",
                state = "VA";
        int zipcode = 22102,
            buildingNumber = 7925;

        System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n"
                + city + " " + state + " " + zipcode);

    }

}
/*
1. create a class named Address and declare the following variables:
			name, buildingNumber, streetName, city, state, zipCode

			use string concatenation to display the full address of the person

			Ex:
				Daniel Owens
				7925 Jones Branch Dr
				McLean VA 22102
 */