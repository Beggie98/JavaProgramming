package day47_Recap.phoneTask;

public class Nokia extends Phone{//Nokia IS A Phone
    public Nokia(String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }

    public void selfDefense(){
        System.out.println(getBrand() + " " + getModel() + " is designed for self defense");
    }

    public void breakTheFloor(){
        System.out.println(getBrand() + " " + getModel() + " can break the floor");
    }

}
