package Statements;

import java.util.Scanner;

public class QuizTask {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the farthest planet in the solar system:\na)venus\nb)pluto\nc)neptune");
        String answer = input.next();

        if (answer.equals("c")){
            System.out.println(answer + " is correct");
        }else if( answer.equals("a") || answer.equals("b")){
            System.out.println(answer + " is wrong");
        }else{
            System.out.println(answer + " is not a valid answer");
        }




    }

}
