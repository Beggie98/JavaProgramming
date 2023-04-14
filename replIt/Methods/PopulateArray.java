package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class PopulateArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int size = input.nextInt();

        populate(new int[size]);

        input.close();

    }




    public static void populate(int[] num){
        for (int i = 0; i < num.length; i++) {
            num[i] = i+1;
        }
        System.out.println(Arrays.toString(num));
    }

}
