package Methods;

import java.util.Scanner;

public class FindCube {
    public static void main(String[] args) {
        cube();
    }

    public static void cube(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int a = input.nextInt();

        System.out.println(a*a*a);

    }

}
