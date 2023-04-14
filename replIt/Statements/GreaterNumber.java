package Statements;

import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        int a = input.nextInt(),
            b = input.nextInt();

        if (a > b){
            System.out.println(a + " is greater");
        }else if(a == b){
            System.out.println("Both numbers are equal");
        }
        else{
            System.out.println(b + " is greater");
        }

        input.close();

    }

}
