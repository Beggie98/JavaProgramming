package Methods;

import java.util.Scanner;

public class RemoveFirstChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();

        System.out.println(RemoveFirstChar(word));
        input.close();
    }

    public static String RemoveFirstChar(String word){
        String result = "";

        result = word.substring(1);

        return result;
    }

}
