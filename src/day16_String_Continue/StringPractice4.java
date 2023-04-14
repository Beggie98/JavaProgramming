package day16_String_Continue;

import java.util.Scanner;

public class StringPractice4 {
    /*
     Write a program  for CheckWords:
	        Program accepts 3 words and :
	            - if they are same length:  print "All words are same length"
	            - if some same length and others not:    print "Not Same nor Different lengths"
	            - if all different length :  print "All different length"

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 words");
        String word1 = input.next();
        String word2 = input.next();
        String word3 = input.next();
        String result = "";

        boolean allSame = word1.length() == word2.length() && word2.length() == word3.length();
        boolean notSame = word1.length() != word2.length() && word2.length() != word3.length() && word1.length() != word3.length();

        if (allSame){
            result = "All words are same length";
        }else if (notSame){
            result = "All words different";
        }else {
            result = "Not same nor different lengths";
        }

        System.out.println(result);
        input.close();

    }
}
