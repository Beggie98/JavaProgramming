package day18_Java_Recap;

import java.util.Scanner;
/*
 Ask user to enter a word. If the work contains starts with x, print the word without x.
                    Input:
                        xcode

                    Output:
                        code
 */
public class WithoutX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = input.next();
        String result = "";

        if (word.startsWith("x")){
            word = word.substring(1);
            result = word;
        }else {
            result = "No x in the word: " + word;
        }
        System.out.println(result);
        input.close();
        System.out.println("------------------------------");

        String sentence = " I love Java programming language";

        //java or Java ==> has Java

        if (sentence.toLowerCase().contains("java")){//we can ignore case sensitivity by creating lowercase version
            System.out.println("Has Java");
        }else{
            System.out.println("Does not have Java");
        }

        System.out.println("---------------------------------------");

        String s1 = "I love cats and dogs";
        boolean loveCats = s1.equalsIgnoreCase("cats");//verifies if s1 IS "cats"
        boolean lovesCats = s1.toLowerCase().contains("love cat");//verifies if s1 HAS cats

    }
}
