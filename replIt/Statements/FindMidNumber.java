package Statements;

import java.util.Scanner;

public class FindMidNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = input.nextInt();
        System.out.println("Enter second number");
        int num2 = input.nextInt();
        System.out.println("Enter third number");
        int num3 = input.nextInt();
        String result = "Medium value is: ";

       if ((num2 < num1 && num1 < num3) || (num3 < num1 && num1 < num2) ){
           result += num1;
       } else if ((num1 < num2 && num2 < num3) || (num3 < num2 && num2 < num1)) {
           result += num2;
       }else if ((num1 < num3 && num3 < num2) || (num2 < num3 && num3 < num1)){
           result += num3;
       }else {
           System.out.println("Numbers should not be equal");
           System.exit(0);
       }

        System.out.println(result);
       input.close();


    }
}
