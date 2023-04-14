package day10_IfStatements;

public class EligibleToBuyAlcohol {

    public static void main(String[] args) {
        int age = 23;
        /*
        String result = "";

        if (age >= 21){
            result = "Eligible";
        }else{
            result = "Not eligible";
        }
        */

        String result = (age>=21) ? "Eligible" : "Not Eligible";

        System.out.println("result = " + result);

        System.out.println("----------------------------------");

        int score = 80;

        System.out.println((score>60) ? "Passed" : "Failed");

        System.out.println("---------------------------------------");




    }


}
