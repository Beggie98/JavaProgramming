package Methods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SimpleRoomBooking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(simpleRoomBook(input.nextBoolean(), input.nextInt(), input.nextInt(), input.nextInt()));

    input.close();

    }

    public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year){
        DateTimeFormatter DF = DateTimeFormatter.ofPattern("MM/dd/YYYY");

        LocalDate date = LocalDate.of(year,month,day);

        LocalDate after = LocalDate.of(2018,07,8);

        LocalDate before = LocalDate.of(2018,07,1);

        if (isAvailable == true && (date.isAfter(after) || date.isBefore(before))){
            return true;
        }

        System.out.println(date.format(DF));

        return false;
    }


}
