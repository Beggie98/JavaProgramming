package day16_String_Continue;

import java.util.Scanner;

public class StringPractice1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
        String word = input.next();
        String result = "";

        String result1 = (word.length() == 0)? "String is empty" :(word.length() > 3)?
                word.substring(word.length() - 3): word;

        /*
        if (word.length() == 0){
            result = "String is empty";
        }else if (word.length()>3){
            result = word.substring(word.length()-3);
        }else {
            result = word;
        }
        System.out.println(result);
         */
        System.out.println(result1);
        input.close();


    }
/*
1. write a method that asks user to enter a string.
	        if the string is empty, print: string is empty
	        if the string has more than 3 characters, print the last three characters
	        if the string has less than or equal 3 characters, print the string itself
 */
}
