package Methods;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.next();

        System.out.println(reverseString(word));

        input.close();
    }

    public static String reverseString(String word){
        String reverse = "";

        for (int i = word.length()-1; i >= 0; i--) {
            reverse += "" + word.charAt(i);
        }

        return reverse;
    }

}
