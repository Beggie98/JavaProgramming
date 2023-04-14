package Methods;

import java.util.Scanner;

public class PrintNext3Numbers {
    public static void main(String[] args) {
        System.out.println("Enter number");
        next3(new Scanner(System.in).nextInt());
    }

    public static void next3(int num){
        System.out.println("Next 3 are");
        for (int i = num+1; i <= num+3 ; i++) {
            System.out.print(i + " ");
        }
    }


}
