package day09_If_Statements_Continue;

public class DaysInWeek {
    /*
    /*
    Tasks:
     1. write program that can print out the name of the day based on the number 1 ~ 7  (7 conditions)
     2. write a program that can print out the name of the month based on the number 1 ~ 12 (12 conditions)
     3. GradeReport
            A: 90 ~ 100
            B: 80 ~ 89
            C: 70 ~ 79
            D: 60 ~ 69
            F:  <60

     */

    public static void main(String[] args) {
        int day = 5;

        if (day == 1){
            System.out.println("Monday");
        }
        else if (day == 2){
            System.out.println("Tuesday");
        }
        else if (day == 3){
            System.out.println("Wednesday");
        }
        else if (day == 4){
            System.out.println("Thursday");
        }
        else if (day == 5){
            System.out.println("Friday");
        }
        else if (day == 6){
            System.out.println("Saturday");
        }
        else{
            System.out.println("Sunday");
        }





    }



}
