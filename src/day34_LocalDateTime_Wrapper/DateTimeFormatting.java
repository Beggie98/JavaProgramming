package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {

    public static void main(String[] args) {
        DateTimeFormatter DF = DateTimeFormatter.ofPattern("MMM/dd/yyyy " + "EEEE");//gives the name of the day E (3 letters) EEEE (full name)
        LocalDate today = LocalDate.now();
        System.out.println(today);

        System.out.println(today.format(DF));//фев/21/2023 вторник

        System.out.println("-----------------------------------------------");

        DateTimeFormatter TF = DateTimeFormatter.ofPattern("hh:mm a");//24 hours format by default, for AM or PM we use "a"
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
        System.out.println(currentTime.format(TF));

        LocalTime time1 = LocalTime.of(17,25);
        System.out.println(time1);//17:25
        System.out.println(time1.format(TF));//05:25 PM

        System.out.println("-------------------------------------------------");

        LocalDateTime a = LocalDateTime.now();
        System.out.println(a);//2023-02-21T12:39:03.759

        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("MMMM/dd/YYYY, EEEE hh:mm a");
        System.out.println(a.format(DTF));

        System.out.println("--------------------------------------------------");

        DateTimeFormatter DTF1 = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/YYYY");

        LocalDateTime time2 = LocalDateTime.of(2020,11,24, 13,00);

        System.out.println(time2.format(DTF1));//вторник, 01:00 PM, 11/24/2020

        System.out.println("---------------------------------------------");

        DateTimeFormatter DTF2 = DateTimeFormatter.ofPattern("EEEE");

        LocalDate date = LocalDate.of(2022,01,01);

        System.out.println(date.format(DTF2));

        System.out.println(nameOfTheDay(2025,5,28));

    }


    public static String nameOfTheDay(int year, int month, int day){
        String result = LocalDate.of(year, month, day).format(DateTimeFormatter.ofPattern("EEEE"));

        return result;
    }


}

// MM/dd/yyyy