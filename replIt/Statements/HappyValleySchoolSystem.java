package Statements;

import java.util.Scanner;

public class HappyValleySchoolSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = input.nextInt();
        String result = "";

        if (age >= 0) {
            if (age <= 2) {
                result = "toddler";
            } else if (age >= 3 && age <= 5) {
                result = "early childhood";
            } else if (age >= 6 && age <= 7) {
                result = "young reader";
            } else if (age >= 8 && age <= 10) {
                result = "elementary";
            } else if (age >= 11 && age <= 12) {
                result = "middle";
            } else if (age == 13) {
                result = "impossible";
            } else if (age >= 14 && age <= 16) {
                result = "high school";
            } else if (age >= 17 && age <= 18) {
                result = "scholar";
            }else {
                result = "ineligible";
            }
        }else {
            result = "Invalid entry";
        }
        System.out.println(result);
        input.close();
    }
}
