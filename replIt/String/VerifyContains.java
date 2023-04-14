package String;

import java.util.Scanner;

public class VerifyContains {
    /*
    Write a program that will verify if the **sentence** contains **word**.
    Print out the result as a boolean value.

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = input.nextLine();

        System.out.println("Enter a word to verify");
        String word = input.next();

        boolean hasWord = sentence.toLowerCase().contains(word);

        System.out.println("Contains the word: " + hasWord);
        input.close();

    }
}
