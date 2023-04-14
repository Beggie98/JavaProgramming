package String;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a text");
        String text = input.next();

        System.out.println("Length is: " + text.length());



        input.close();
    }
}
