package day17_String_Continue;

import java.util.Scanner;

public class FirstAndLastChars {
    /*
    write a program that can check if the first and last characters of the string are same
	            ex:
	                Level
	            output:
	                same
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.next();

        /* Way 1
        String first = word.substring(0,1);
        String last = word.substring(word.length()-1);

        if (first.equalsIgnoreCase(last)){
            System.out.println("same");
        }else {
            System.out.println("Different");
        }

         */


        String first = word.substring(0,1).toLowerCase();
        String last = word.substring(word.length()-1).toLowerCase();

        if (first.equals(last)){
            System.out.println("same");
        }else {
            System.out.println("Different");
        }

    }
}
