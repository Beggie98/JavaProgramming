package Variables;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hour = input.nextByte(),
            minute = input.nextByte(),
            second = input.nextByte();
        String amOrPm = input.next();

        System.out.println(hour + ":" + minute + ":" + second + " " + amOrPm);

        input.close();
    }
}
