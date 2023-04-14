package Statements;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int weekDay = input.nextInt();
        String result = "";

        switch (weekDay){
            case 1: result = "Monday";
            break;
            case 2: result = "Tuesday";
            break;
            case 3: result = "Wednesday";
            break;
            case 4: result = "Thursday";
            break;
            case 5: result = "Friday";
            break;
            case 6: result = "Saturday";
            break;
            case 7: result = "Sunday";
            break;
            default: result = "Invalid Input";
            break;

        }
        System.out.println(result);
        input.close();

    }
}
