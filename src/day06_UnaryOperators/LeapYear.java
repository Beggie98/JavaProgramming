package day06_UnaryOperators;

public class LeapYear {
    /*
    2. create a class named LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
		Ex:
				year = 2020

			output:
				2020 is leap year: true
     */

    public static void main(String[] args) {
        int year = 2023;
        boolean leapYear = year%4 == 0;//if the number of years can be evenly divisible by 4, it's known as the leap year

        System.out.println("Year " + year + " is a leap year: " +leapYear);
    }
}
