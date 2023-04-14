package Statements;

import java.util.Scanner;

public class BurgerOrChicken {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to order?");
        String order = input.next();
        double price = 0;

        if (order.equalsIgnoreCase("burder") || order.equalsIgnoreCase("chicken")){
            price += 10;
        }else if (order.equalsIgnoreCase("soda")){
            price += 2;
        } else if (order.equalsIgnoreCase("fries")) {
            price += 3.5;
        }else{
            System.out.println("Sorry, " + order +" is not in the menu");
        }

        System.out.println("price = " + price);
    }
}
