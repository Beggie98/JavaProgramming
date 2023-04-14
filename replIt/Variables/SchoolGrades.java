package Variables;

import java.util.Scanner;

public class SchoolGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");
        String subject1 = input.next();
        double score1 = input.nextDouble();

        System.out.println("Please enter subject name number 2 and score for this subject");
        String subject2 = input.next();
        double score2 = input.nextDouble();

        System.out.println("Please enter subject name number 3 and score for this subject");
        String subject3 = input.next();
        double score3 = input.nextDouble();

        System.out.println("Please enter subject name number 4 and score for this subject");
        String subject4 = input.next();
        double score4 = input.nextDouble();

        System.out.println("Please enter subject name number 5 and score for this subject");
        String subject5 = input.next();
        double score5 = input.nextDouble();

        double averageGrade = (score1 + score2 + score3 + score4 + score5)/5;

        System.out.println("Summary: " + subject1 + " - " + score1 + ", " +
                subject2 + " - " + score2 + ", " + subject3 + " - " + score3
                + ", " + subject4 + " - " + score4 + ", " + subject5 + " - " + score5);
        System.out.println("Your average score is: " + averageGrade);
        System.out.println("Thank you for using Grader!\nGoodbye!");

        input.close();


    }
}
