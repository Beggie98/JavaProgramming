package day19_Loops;

import java.util.Scanner;

public class MaxOf5Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 words");
        int max = 0;
        String result = "";

        for (int i = 0; i < 5; i++) {
            String word = input.next();

            if (word.length()>max){
                max = word.length();
                result = word;
            }

        }
        System.out.println(result);
        input.close();
    }
}
