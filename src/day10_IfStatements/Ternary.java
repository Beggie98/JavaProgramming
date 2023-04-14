package day10_IfStatements;

public class Ternary {

    public static void main(String[] args) {
        int number = 21;
        String result1 = "";

        if (number%2==0){
            result1 = "Even";
        }
        else {
            result1 = "Odd";
        }

        System.out.println("result1 = " + result1);

        System.out.println("------------------------------------");

        String result2 = (number%2==0) ? "Even" : "Odd";
        System.out.println("result2 = " + result2);


    }


}
