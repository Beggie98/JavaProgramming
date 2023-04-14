package Methods;

import java.util.Scanner;

public class ExtractNumberFromString {
    public static void main(String[] args) {
        System.out.println(extractNum());
    }

    public static String extractNum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();
        String result = "";
        for (char each : word.toCharArray()) {
            if (Character.isDigit(each)){
                result += each;
            }
        }

        return result;
    }


}
