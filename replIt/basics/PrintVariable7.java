package basics;

import java.util.Scanner;

public class PrintVariable7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter topics");
        String topic1 = input.nextLine(),
                topic2 = input.nextLine();

        System.out.println("I will learn " + "\"" + topic1 + "\"" + " and "
                + "\"" + topic2 + "\"" + " at CybertekSchool");
    }
}
