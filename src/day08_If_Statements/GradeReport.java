package day08_If_Statements;

public class GradeReport {
/*
score

grade:
    A: 90 <= score <= 100
    B: 80 <= score <= 89
    C: 70 <= score <= 79
    D: 60 <= score <= 69
    F: score < 60
 */
    public static void main(String[] args) {
        int score = 85;

        if(score >= 90 && score <= 100){
            System.out.println("Excellent. Your score is A");
        }
        if(score >= 80 && score <= 89){
            System.out.println("Great. Your score is B");
        }
        if(score >= 70 && score <= 79){
            System.out.println("Good. Your score is C");
        }
        if(score >= 60 && score <= 69){
            System.out.println("Your score is D");
        }
        if(score < 60){
            System.out.println("Your score is F");
        }






    }




}
