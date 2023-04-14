package day16_String_Continue;

import java.util.Scanner;

public class StringPractice3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a three letter word");
        String word = input.next();
        String result = "";

        if (word.length() == 3){
            if (word.charAt(1)=='a'){
                result = "Cool Word";
            }else{
                result = "Okay word";
            }
        }else if (word.length() < 3){
            result = "Word is too short";
        }else{
            result = "Word is too long";
        }
        System.out.println(result);
        input.close();
    }
/*
write a program that asks the user enter a three letter word. Check if the middle character of the given word is 'a'.
In the case it is print: "Cool word", but in the case the middle letter is not 'a' print: "Okay word".
	     - If the user does not enter a 3 letter word tell them:
	     		If the word is less than 3 letters: "Word is too short"
	     		If the word is too long: "Word is too long"
 */

}