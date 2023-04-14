package day23_Arrays;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
                        //  1   2       3       4     5     6       7
        String[] days = {"Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //       index:    0     1      2      3      4      5      6
        System.out.println("Enter a number");
        int num = new Scanner(System.in).nextInt();

        if (num >= 1 && num <= 7){
            System.out.println(days[num-1]);
        }else {
            System.out.println("Invalid number");
        }

    }
}
