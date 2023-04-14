package Statements;

import java.util.Scanner;

public class ConsoleMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select an option:\n1) option 1\n2) option 2\n3) option 3");
        int option = input.nextInt();
        String result = "User selected ";

        if (option==1){
            result += option;
        } else if (option==2) {
            result += option;
        }else if (option==3){
            result += option;
        }else{
            result += "invalid option";
        }

        System.out.println(result);
        input.close();

    }
}
