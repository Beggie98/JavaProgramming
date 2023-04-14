package day16_String_Continue;

import java.util.Scanner;

public class StringPractice2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word");
        String word1 = input.next();

        System.out.println("Enter second word");
        String word2 = input.next();

        String result = "";

        if (word1.length() >= 2 && word2.length()>=2) {
            word1 = word1.substring(1);
            word2 = word2.substring(1);
            result = word1+word2;
        }else {
            result = "Too short words";
        }
        System.out.println(result);
        input.close();
    }
}
