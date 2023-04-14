package Statements;

import java.util.Scanner;

public class IfStatementGrades {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();
        String result = "";

        if (grade >= 0 && grade <= 100){
            if (grade >= 90){
                result = "excellent";
            }else if (grade >= 70){
                result = "good";
            } else if (grade >= 60) {
                result = "pass";
            }else {
                result = "fail";
            }
        }else {
            result = "Invalid input";
        }
        System.out.println(result);
        input.close();

    }
}
