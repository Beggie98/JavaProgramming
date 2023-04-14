package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDatePractice {
    public static void main(String[] args) {
        String[] classmates = {"Doston", "Shohruz", "Javlon", "Ulug'bek", "Nodir"};
        LocalDate[] DoB = {
                    LocalDate.of(1995,5,12),
                    LocalDate.of(1996,4,21),
                    LocalDate.of(1997,10,5),
                    LocalDate.of(1998,02,14),
                    LocalDate.of(1992,12,23)
        };
        LocalDate youngest = DoB[0];
        String youngestMate = "";
        String leapYear = "";
        for (int i = 0; i < classmates.length; i++) {
            if (DoB[i].isAfter(youngest)){
                youngest = DoB[i];
                youngestMate = classmates[i];
            }
            if (DoB[i].isLeapYear()){
                leapYear += classmates[i] + " ";
            }
        }

        System.out.println(youngestMate + " is youngest");
        System.out.println("leapYear = " + leapYear);

        System.out.println("--------------------------------------------------");
        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("EEEE, MMM/dd/YYYY");

        for (int i = 0; i < classmates.length; i++) {
            System.out.println(classmates[i] + " was born on " + DoB[i].format(DTF));
        }


    }
}
/*
    1. create string array to have 5 of your classmate's names

	2. create an array that contains thier DofB

	3. find out who is the youngest person

	4. find out who was born on leap year
 */