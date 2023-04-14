package day12_Scanner;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your score: ");
        int score = input.nextInt();
        char grade = (score >= 90)? 'A' :(score>=80)? 'B' :(score>=70)? 'C' :(score>=60)? 'D' : 'F';

        System.out.println("grade = " + grade);
    }
}
