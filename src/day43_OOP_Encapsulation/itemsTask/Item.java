package day43_OOP_Encapsulation.itemsTask;

public class Item {

    public String name;
    public double unitPrice;
    public int quantity;

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost(){
        return unitPrice * quantity * 1.08;//tax 8%
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalCost= " + calcCost() +
                '}';
    }
}
/*
 create a class called Item
            instance variables:
                name, unitPrice, quantity

            add a constructor that can initialize all the fields

            instance methods:
                calcCost(): returns the total cost
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
 */
