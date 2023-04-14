package day09_If_Statements_Continue;

public class Tasks {
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
        int numberOfTheDay = 6;

        if (numberOfTheDay==1){
            System.out.println("Monday");
        }
        if (numberOfTheDay==2){
            System.out.println("Tuesday");
        }
        if (numberOfTheDay==2){
            System.out.println("Wednesday");
        }
        if (numberOfTheDay==4){
            System.out.println("Thursday");
        }
        if (numberOfTheDay==5){
            System.out.println("Friday");
        }
        if (numberOfTheDay==6){
            System.out.println("Saturday");
        }
        if (numberOfTheDay==7){
            System.out.println("Sunday");
        }




    }
}
