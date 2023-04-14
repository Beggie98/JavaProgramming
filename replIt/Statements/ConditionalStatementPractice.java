package Statements;

import java.util.Scanner;

public class ConditionalStatementPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a name");
        String name = input.next();

        if (name.equals("Chen")){
            System.out.println("Teacher");
        }else{
            System.out.println("Student");
        }
        input.close();
    }
}
