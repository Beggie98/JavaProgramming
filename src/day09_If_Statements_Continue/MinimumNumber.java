package day09_If_Statements_Continue;

public class MinimumNumber {
    /*
    2. write a program that can print out the minimum number between two different numbers

        Ex:
            num1 = 20;
            num2 = 30;

            output:
                20 is the minimum number
     */

    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 30;

        if (num1 < num2){
            System.out.println(num1 + " is the minimum number");
        }
        if (num2 < num1){
            System.out.println(num2 + " is the minimum number");
        }
        System.out.println("----------------------------");

        if (num1 < num2){
            System.out.println(num1 + " is the minimum number");
        }else{
            System.out.println(num2 + " is the minimum number");
        }


    }



}
