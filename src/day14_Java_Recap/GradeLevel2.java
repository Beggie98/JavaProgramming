package day14_Java_Recap;

import java.util.Scanner;

public class GradeLevel2 {
/*
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School
                    Other: Invalid grade level given
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the grade number");
        byte number = input.nextByte();

        String result = "";

        switch (number){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: result = "Elementary school";
            break;

            case 6:
            case 7:
            case 8: result = "Middle school";
            break;

            case 9:
            case 10:
            case 11:
            case 12: result = "High school";
            break;

            case 13:
            case 14:
            case 15:
            case 16: result = "College";
            break;

            case 17:
            case 18: result = "Grad School";
            break;

            default: result = "Invalid grade level given";
            break;
        }

        System.out.println(result);
        input.close();


    }

}
