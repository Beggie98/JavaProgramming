package day57_Collection_Recap;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = input.nextInt();

        for (int i = 0; i <= number ; i++) {
            System.out.print(i);
            if (i == number){
                System.out.println(".");
                break;
            }
            System.out.print(", ");
        }


    }

}
