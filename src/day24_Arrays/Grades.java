package day24_Arrays;

import java.util.Arrays;

public class Grades {
    /*
    given the following arrays:
		 String [] names = {"Anna", "Nancy", "Sarah"};
         int [] scores = {90, 75, 80};
         char [] grades = new char[names.length];

         write a program that can store the gardes of the students in the array named grades
     */
    public static void main(String[] args) {
        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];

        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;
        double sum = 0;


        for (int i = 0; i < names.length; i++) {
            int eachScore = scores[i];
            char eachGrade = grades[i];
            String eachName = names[i];

            sum += eachScore;
            /*
            eachGrade = (eachScore >= 90)? 'A' :(eachScore >= 80)? 'B' :(eachScore >= 70)? 'C'
                    :(eachScore >= 60)? 'D' : 'F';
            */




            if (eachScore >= 0 && eachScore <= 100){
                if (eachScore >= 90){
                    eachGrade = 'A';
                    countA++;
                } else if (eachScore >= 80) {
                    eachGrade = 'B';
                    countB++;
                } else if (eachScore >= 70) {
                    eachGrade = 'C';
                    countC++;
                } else if (eachScore >= 60) {
                    eachGrade = 'D';
                    countD++;
                }else {
                    eachGrade = 'F';
                    countF++;
                }
            }else {
                System.out.println("Invalid score");
            }

            System.out.println(eachName + " " + eachScore + " " + eachGrade);

        }

        double avg = sum/ names.length;
        System.out.println("countA = " + countA);
        System.out.println("countB = " + countB);
        System.out.println("countC = " + countC);
        System.out.println("countD = " + countD);
        System.out.println("countF = " + countF);
        System.out.println("avg = " + avg);


    }
}
