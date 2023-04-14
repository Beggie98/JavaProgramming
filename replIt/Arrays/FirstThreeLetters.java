package Arrays;

import java.util.Scanner;

public class FirstThreeLetters {
    public static void main(String[] args) {
        String[] arr = new String[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = new Scanner(System.in).next();

        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i].substring(0,3));
        }


    }
}
