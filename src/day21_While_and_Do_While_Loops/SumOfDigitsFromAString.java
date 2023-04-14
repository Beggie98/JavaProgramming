package day21_While_and_Do_While_Loops;

import java.util.Scanner;

public class SumOfDigitsFromAString {
    public static void main(String[] args) {
        /*
         Write a program that can return the sum of digits froma  string
     		Ex:
     			input: A1B2C3

     			output: 6
     					1+2+3
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");//A1B2C3
        String word = input.next();
        int sum = 0;

        for (char i = 0; i < word.length(); i++) {

            int character = word.charAt(i);
            if (character >= '0' && character <= '9'){
                sum += character-48;//in order to convert character digit to integer number
            }

        }
        System.out.println(sum);
        input.close();

    }
}
