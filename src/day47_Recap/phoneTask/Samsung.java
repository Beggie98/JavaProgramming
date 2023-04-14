package day47_Recap.phoneTask;

public class Samsung extends Phone {

    public Samsung(String model, String size, double price, String color) {
        super("Samsung", model, size, price, color);
    }

    @Override
    public void call(long phoneNumber) {
        System.out.println("Samsung galaxy is calling " + phoneNumber);
    }

    @Override
    public void text(long phoneNumber) {
        System.out.println("Samsung galaxy is texting to " + phoneNumber);
    }

    public void text(long phone1, long phone2){
        text(phone1);
        text(phone2);
    }

    public void text(long phone1, long phone2, long phone3){
        text(phone1, phone2);
        text(phone3);
    }

    public void text(long phone1, long phone2, long phone3, long phone4){
        text(phone1, phone2, phone3);
        text(phone4);
    }

    public void freeze(){
        System.out.println(getBrand() + " " + getModel() + " is freezing");
    }

}
/*
2. Samsung:
					variables: brand, model, size, price, color

					methods: call(), text(), freeze(), toString()
 */