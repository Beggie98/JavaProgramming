package Variables;

import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter seconds: ");
        int seconds = input.nextInt();
        int hour = seconds / 3600;
        int minute = (seconds % 3600) / 60;
        int second = (seconds % 3600) % 60;

        System.out.println(seconds + " seconds is equal to " + hour + " hours, " + minute + " minutes and "
                + second + " seconds.");

        input.close();

    }
}
