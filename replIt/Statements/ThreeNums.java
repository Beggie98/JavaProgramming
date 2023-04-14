package Statements;

import java.util.Scanner;

public class ThreeNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        String result = "";

        if (n1 > n2 && n1 > n3){
            result = "n1 is bigger";
        } else if (n2 > n3 && n2 > n1) {
            result = "n2 is bigger";
        }else if (n3 > n2 && n3 > n1){
            result = "n3 is bigger";
        }else {
            result = "Numbers shouldn't be equal";
        }

        System.out.println(result);


    }
}
