package Statements;

import java.util.Scanner;

public class GiftCard {
    /*
     **_List of items_**
> Blanket - 60$
> Charger - 15$
> Hat - 25$
> Headphones - 30$
> Laptop - 200$
> Pants - 50$
> Pillow - 40$
> Smartphone - 1000$
> Socks - 5$
> USB cable - 10$

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What do you want to buy?");
        String item = input.nextLine();
        int balance = 100;
        String result = "";

        if (item.equals("Blanket")){
            balance -= 60;
            result = "Thank you for your purchase!\n" +
                    "Your current balance is: $" + balance;
        }else if (item.equals("Charger")){
            balance -= 15;
            result = "Thank you for your purchase!\n" +
                    "Your current balance is: $" + balance;
        }else if (item.equals("Hat")){
            balance -= 25;
            result = "Thank you for your purchase!\n" +
                    "Your current balance is: $" + balance;
        }else if (item.equals("Headphones")){
            balance -= 30;
            result = "Thank you for your purchase!\n" +
                    "Your current balance is: $" + balance;
        }else if (item.equals("Laptop")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if (item.equals("Pants")){
            balance -= 50;
            result = "Thank you for your purchase!\n" +
                    "Your current balance is: $" + balance;
        }else if (item.equals("Pillow")){
            balance -= 40;
            result = "Thank you for your purchase!\n" +
                    "Your current balance is: $" + balance;
        }else if (item.equals("Smartphone")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if (item.equals("Socks")){
            balance -= 5;
            result = "Thank you for your purchase!\n" +
                    "Your current balance is: $" + balance;
        }else if (item.equals("USB cable")){
            balance -= 10;
            result = "Thank you for your purchase!\n" +
                    "Your current balance is: $" + balance;
        }else {
            result = "Invalid item!";
        }
        System.out.println(result);
        input.close();
    }
}
