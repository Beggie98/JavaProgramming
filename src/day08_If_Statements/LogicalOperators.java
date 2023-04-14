package day08_If_Statements;

public class LogicalOperators {

    public static void main(String[] args) {

        System.out.println( !true );//false
        System.out.println(!false);//true

        System.out.println( true == !false);//true
        //                  true == true

        System.out.println( true != !true);//true
        //                  true != false
        System.out.println("---------------------------");

        int score = 80;
        boolean passed = score >= 60;
        boolean failed = !passed;//score < 60
        System.out.println("passed: " + passed);

        System.out.println("---------------------------");

        int age = 21;

        boolean eligible = age >= 21;
        boolean notEligible = !eligible;

        System.out.println("Eligible: " + eligible);



    }



}
