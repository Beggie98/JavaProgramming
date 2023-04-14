package day10_IfStatements;

public class TernaryPractice {

    public static void main(String[] args) {
        int number = 100;
        /*
        String result = "";

        if (number > 0){
            result = "Positive";
        }else if (number < 0){
            result = "Negative";
        }else {
            result = "Zero";
        }
        */
        String result = (number > 0) ? "Positve" :(number<0)?  "Negative" : "Zero";

        System.out.println("--------------------------------------------------------");

        int score = 100;

        char grade = (score>=90)? 'A' :(score>=80)? 'B' :(score>=70)? 'C' :(score>=60)? 'D' : 'F';




    }


}
