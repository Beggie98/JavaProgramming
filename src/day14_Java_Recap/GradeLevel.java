package day14_Java_Recap;

import java.util.Scanner;

public class GradeLevel {
/*
 Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School
                    Other: Invalid grade level given
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grade number");
        byte gradeNumber = input.nextByte();

        String result = (gradeNumber >= 1 && gradeNumber <=18)? (gradeNumber <= 5)? "Elementary school"
                :(gradeNumber <=8)? "Middle school" :(gradeNumber<=12)? "High school"
                :(gradeNumber<=16)? "College" : "Grad School" : "Invalid grade level given";

//        if (gradeNumber >= 1 && gradeNumber <=18){
//            if (gradeNumber <= 5){
//                result = "Elementary school";
//            }else if (gradeNumber <=8){
//                result = "Middle school";
//            }else if (gradeNumber<=12){
//                result = "High school";
//            }else if (gradeNumber<=16){
//                result = "College";
//            }else {
//                result = "Grad School";
//            }
//        }else{
//            result = "Invalid grade level given";
//        }

        System.out.println(result);
        input.close();

    }

}
