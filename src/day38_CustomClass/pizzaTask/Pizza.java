package day38_CustomClass.pizzaTask;

public class Pizza {
    public char size;
    public int numberOfCheeseTopping, numberOfPepperoniTopping;

    public void customOrder(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost(){
        double totalPriceOfTopping = 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
        double startingPrice = (size == 'S')? 10 :(size == 'M')? 12 : 14;

        return (totalPriceOfTopping + startingPrice)*1.08;//8% tax
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price= $" + calcCost() +
                '}';
    }
}
/*
Pizza:
    	Attributes:
    		size, numberofCheeseTopping, numberOfPepperoniTopping

		Actions:
			customOrder(): sets all attributes of Pizza
			calcCost(): returns the totalCost of the pizza
			toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by 			calcCost()

		Pizza cost is determined by:
                        Small: $10 + $2 per topping
                        Medium: $12 + $2 per topping
                        Large: $14 + $2 per topping
 */