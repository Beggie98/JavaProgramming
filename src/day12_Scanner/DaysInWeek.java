package day12_Scanner;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number");
        int number = input.nextInt();
        String name = "";

        switch (number){
            case 1: name = "Monday";
            break;
            case 2: name = "Tuesday";
            break;
            case 3: name = "Wednesday";
            break;
            case 4: name = "Thursday";
            break;
            case 5: name = "Friday";
            break;
            case 6: name = "Saturday";
            break;
            case 7: name = "Sunday";
            break;
            default: name = "Invalid";
            break;
        }
        System.out.println(name);

    }
}
