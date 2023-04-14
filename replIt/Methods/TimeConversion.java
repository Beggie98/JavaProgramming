package Methods;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        timeConversion(input.nextLine());
    }

    public static void timeConversion(String str){
        String hour = str.substring(0,2);
        String ampm = str.substring(str.length()-2);

        if (ampm.equals("AM")){
            if (hour.equals("12")){
                hour = "00";
            }
        }else if (ampm.equals("PM")){
            if (hour.equals("01")){
                hour = "13";
            }else if (hour.equals("02")){
                hour = "14";
            }else if (hour.equals("03")){
                hour = "15";
            }else if (hour.equals("04")){
                hour = "16";
            }else if (hour.equals("05")){
                hour = "17";
            }else if (hour.equals("06")){
                hour = "18";
            }else if (hour.equals("07")){
                hour = "19";
            }else if (hour.equals("08")){
                hour = "20";
            }else if (hour.equals("09")){
                hour = "21";
            }else if (hour.equals("10")){
                hour = "22";
            }else if (hour.equals("11")){
                hour = "23";
            }
        }

        System.out.println(hour + str.substring(str.indexOf(":"),str.indexOf("M")-1));

    }


}
