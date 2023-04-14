package Methods;

import java.util.Scanner;

public class LimitString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a text");
        String text = input.nextLine();
        int num = input.nextInt();

        System.out.println(limitString(text, num));
        input.close();

    }

    public static String limitString(String text, int num){

        String result = "";

        for (int i = 0; i < num; i++) {
            result += "" + text.charAt(i);
        }

        return result;
    }


}
