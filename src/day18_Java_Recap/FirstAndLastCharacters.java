package day18_Java_Recap;

import java.util.Scanner;
/*
Ask user to enter two words. Then add them together and print.
But if the last letter of the first word and the first letter of the last letter is the same,
print that character once.
                    Input:
                        one
                        eight

                    Output:
                        oneight
 */
public class FirstAndLastCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two words");
        String word1 = input.next();
        String word2 = input.next();
        String result = "";

        /*
        if (word1.substring(word1.length()-1).equalsIgnoreCase(word2.substring(0,1))){
            result = word1 + word2.substring(1);
        }else {
            result = word1 + word2;
        }

         */

        /*
        if (word1.charAt(word1.length() - 1) == word2.charAt(0)){
            result = word1 + word2.substring(1);
        }else {
            result = word1 + word2;
        }
         */

        if (word1.toLowerCase().endsWith(word2.toLowerCase().substring(0,1))){
            result = word1 + word2.substring(1);
        }else {
            result = word1 + word2;
        }


        System.out.println(result);
        input.close();
    }
}
