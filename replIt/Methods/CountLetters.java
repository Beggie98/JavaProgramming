package Methods;

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();

        System.out.println(countLetters(word));
        input.close();

    }

    public static String countLetters(String word){
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            char ch = word.charAt(i);
            for (int j = 0; j < word.length(); j++) {
                char each = word.charAt(j);
                if (each == ch){
                    count++;
                }

            }
            if (!result.contains(""+ch)){
                result += "" + ch + count;
            }
        }

        return result;

    }


}
