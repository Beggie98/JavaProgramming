package day14_Java_Recap;

import java.util.Scanner;

public class NumberOfDigits {
    /*
       Given a number(int) determine and print how many digits it has.
            - Condition: The number has to be between 1 and 100000, if it is not print "Invalid number"

            Ex: 124 --> 3 digits
                13213 --> 5 digits
                883218 --> Invalid number
                23 --> 2 digits
                9 --> one digit
                15 --> 2 digits
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = input.nextInt();


        String result = "";

        if (number>=1 && number<=100000){
            if (number<10){
                result = number + " is 1 digit";
            }else if (number<100){
                result =number + " is 2 digits";
            }else if(number<1000){
                result = number + " is 3 digits";
            }else if (number<10000){
                result = number + " is 4 digits";
            }else if (number < 100000){
                result = number + " is 5 digits";
            }else{
                result = number + " is 6 digits";
            }
        }else{
            result = "Invalid input";
        }

        /*
        String result1 = (number>=1 && number<=100000)? (number<10)? "1 digit" :(number<100)? "2 digits"
                :(number<1000)? "3 digits" :(number<10000)? "4 digits"
                :(number < 100000)? "5 digits" : "6 digits" : "Invalid input";
        */

        System.out.println(result);
        input.close();
    }
}
