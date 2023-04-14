package Day23_Arrays;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //                   1                                                                 12
        String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        //         index:    0     1     2     3     4     5     6     7     8     9     10    11
        System.out.println("Enter a number");
        int num = input.nextInt();
        if (num >= 1 && num <= 12) {
            System.out.println(months[num - 1]);
        }else {
            System.out.println("Invalid number");
        }
    }
}
