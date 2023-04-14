package day12_Scanner;

import java.util.Scanner;

public class NameOfMonth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int month = input.nextInt();
        String nameOfMonth = "";

        switch (month){
            case 1: nameOfMonth = "Jan";
            break;
            case 2: nameOfMonth = "Feb";
            break;
            case 3: nameOfMonth = "Mar";
            break;
            case 4: nameOfMonth = "Apr";
            break;
            case 5: nameOfMonth = "May";
            break;
            case 6: nameOfMonth = "Jun";
            break;
            case 7: nameOfMonth = "Jul";
            break;
            case 8: nameOfMonth = "Aug";
            break;
            case 9: nameOfMonth = "Sep";
            break;
            case 10: nameOfMonth = "Oct";
            break;
            case 11: nameOfMonth = "Nov";
            break;
            case 12: nameOfMonth = "Dec";
            break;
            default: nameOfMonth = "Invalid Input";
        }
        System.out.println(nameOfMonth);

    }
}
