package day43_OOP_Encapsulation.itemsTask;

import static day43_OOP_Encapsulation.itemsTask.MyCart.*;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Checkout {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        ArrayList<Item> items = new ArrayList<>();
        items.addAll(Arrays.asList(item1,item2,item3,item4,item5));

        double totalCost = 0;

        for (Item eachItem : items) {
            totalCost += eachItem.calcCost();
        }

        System.out.println("totalCost = $" + df.format(totalCost));


    }

}
/*
Create a class named CheckOut
            1. Create an ArrayList of Items
            2. add all the 5 items from MyCart to the ArrayList items
            3. calculate the total price of all the items (including the tax)
                        Assume that the sales tax is 8%

 */