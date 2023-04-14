package day47_Recap.phoneTask;

public class Phone {
    private final String brand;
    private final String model;
    private final String size;
    private double price;
    private String color;

    public final static boolean isTouchScreen;
    public final static boolean hasSimCard;

    static {
        isTouchScreen = true;
        hasSimCard = true;
    }

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        setPrice(price);
        setColor(color);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public double getPrice(){
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(double price){
        if (price < 0){
            return;
        }
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public void call(long phoneNumber){
        System.out.println("Phone is calling " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println("Phone is texting to " + phoneNumber);
    }

}
/*
0. Phone:
				variables: brand, model, size, price, color
				methods: call(), text()
 */