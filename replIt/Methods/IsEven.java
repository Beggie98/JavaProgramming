package Methods;

import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) {
        System.out.println("Is even: " + isEven(new Scanner(System.in).nextInt()));
    }

    public static boolean isEven(int number){
        boolean isEven = false;
        if (number%2==0){
            isEven = true;
        }

        return isEven;
    }


}
