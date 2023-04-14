package OOP.calc2Task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value for x");
        int x = input.nextInt();
        System.out.println("Enter value for y");
        int y = input.nextInt();

        Calc a = new Calc();
        a.setX(x);
        a.setY(y);
        a.minus();

        System.out.println(a.getResult());//5

        a.plus();

        System.out.println(a.getResult());//15

        input.close();


    }
}
