package day12_Scanner;

public class Grade {
    public static void main(String[] args) {
        /*
        1. a char variable named grade is given. use switch statement to print the following messages:
                if the grade is 'A' print excellent
                if the grade is 'B' print great job
                if the grade is 'C' print good
                if the grade is 'D' print passed
                if the grade is 'F' print failed
                other wise print invalid
         */
        char grade = 'A';
        String message = "";

        switch (grade){
            case 'A': message = "excellent";
            break;
            case 'B': message = "great job";
            break;
            case 'C': message = "good";
            break;
            case 'D': message = "passed";
            break;
            case 'F': message = "failed";
            break;
            default: message = "invalid input";
            break;
        }
        System.out.println(message);


    }

}
