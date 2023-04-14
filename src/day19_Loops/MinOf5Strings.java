package day19_Loops;

import java.util.Scanner;

public class MinOf5Strings {
    public static void main(String[] args) {

        int min = Integer.MAX_VALUE;
        String result = "";

        for (int i=0; i < 5; i++){
            System.out.println("Enter a word");
            String word = new Scanner(System.in).next();

            if (word.length()<min){
                min = word.length();
                result = word;
            }
        }
        System.out.println(result);
    }
}
