package day21_While_and_Do_While_Loops;

import java.util.Scanner;

public class DigitsLettersSpecialCharacters {
    /*
        write a program that can retive the digits, letters and special characters from a string
			Ex:
				input:
					mn@#123Ab!

				output:
					letters: mnAb
					digits: 123
					special chars: @#!
         */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();

        String letters = "";
        String digits = "";
        String specialCharacters = "";

        for (int i = 0; i < word.length() ; i++) {
            char character = word.charAt(i);
            if ((character>= 'A' && character<='Z') || (character>='a' && character <= 'z')  ){
                letters += character;
            } else if (character>= '0' && character<='9') {
                digits += character;
            }
            else {
                specialCharacters += character;
            }
        }
        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialCharacters);
        input.close();
    }
}
