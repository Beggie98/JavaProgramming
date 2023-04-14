package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;

public class Birthday {
    public static void main(String[] args) {
        birthday(1998,02,22);
    }

    public static void birthday(int year, int month, int day){
        LocalDate DoB = LocalDate.of(year, month, day);//1985-7-22

        LocalDate today = LocalDate.now();//2021-7-22
        int age = today.getYear() - DoB.getYear();
        if (DoB.getMonthValue() == today.getMonthValue() && DoB.getDayOfMonth() == today.getDayOfMonth()){
            System.out.println("Happy Birthday");
            System.out.println("Today you are " + age + " years old!");
        }else {
            System.out.println("Today is not your birthday");
        }


    }


}
