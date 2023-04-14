package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the radius: ");
        double radius = input.nextDouble();
        double pi = 3.14;
        double perimeter = 2 * pi * radius;
        double area = pi * radius * radius;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);



    }
}
