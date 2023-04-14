package day18_Java_Recap;

import java.util.Scanner;

public class DigitLetterOrSpecialChar {
    /*
    Ask user to enter a word,
		if the word starts with digits, print "first character is digit"
		if the word starts with uppercase letters, print "first character is lowercase letter"
		if the word starts with lowercase letters, print "first character is uppercase letter"
		if the word starts with special characters, print "first character is special character"

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word please");
        String word = input.next();
        String result = "";

        if (word.charAt(0) >= 48 && word.charAt(0) <= 57 ){
            //               '0'                      '9'
            result = "first character is digit";
        }else if (word.charAt(0) >= 65 && word.charAt(0) <= 90){
            //                      'A'                     'Z'
            result = "first character is uppercase letter";
        }else if (word.charAt(0) >= 97 && word.charAt(0) <= 122){
            //                      'a'                     'z'
            result = "first character is lowercase letter";
        }else {
            result = "first character is special character";
        }

        System.out.println(result);
        input.close();
    }
}
