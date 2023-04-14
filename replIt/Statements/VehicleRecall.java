package Statements;

import java.util.Scanner;

public class VehicleRecall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter vehicle's year");
        int year = input.nextInt();
        String result = "";
        boolean needsToBeRecalled = (year >= 1995 && year <= 1998) || (year >= 2001 && year <= 2002) ||
                (year >= 2004 && year <= 2006) || (year >= 2015 && year <= 2017);

        if (year >= 1990 && year <= 2023) {
            if (needsToBeRecalled) {
                result = "Your vehicle needs to be recalled!";
            } else {
                result = "Your vehicle is fine, enjoy!";
            }
        }else {
            result = "Invalid input";
        }
        System.out.println(result);
        input.close();
    }
}
