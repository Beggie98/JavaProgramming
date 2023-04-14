package day35_ArrayList;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class WarmupTask1 {

    public static void main(String[] args) {

        LocalDate[] dates = new LocalDate[10];

        DateTimeFormatter DF = DateTimeFormatter.ofPattern("MMMM/dd, EEEE");//November/25, Wednesday

        for (int i = 0; i < dates.length; i++) {
            dates[i] = LocalDate.now().plusDays(i+1);
        }
        System.out.println(Arrays.toString(dates));

        for (LocalDate each : dates){
            System.out.println(each.format(DF));
        }

    }



}
/*
create an array of LocalDate and has the next 10 day's dates, use for each loop to print each Date in the following formar:
                MonthName/Day, Day Name

                ex:
                    November/25, Wednesday

 */
