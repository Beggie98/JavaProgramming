package day43_OOP_Encapsulation.itemsTask;

public class MyCart {
        public static Item item1, item2, item3, item4, item5;


        static {
            item1 = new Item("Apple",0.1,15);
            item2 = new Item("Water Bottle",0.2,20);
            item3 = new Item("Watermelon",1.5,2);
            item4 = new Item("TV",300,1);
            item5 = new Item("Fridge",350,1);
        }

}
