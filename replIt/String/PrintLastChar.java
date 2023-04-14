package String;

import java.util.Scanner;

public class PrintLastChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word please");
        String word = input.next();

        System.out.println(word.charAt(word.length()-1));

        input.close();
    }
}
