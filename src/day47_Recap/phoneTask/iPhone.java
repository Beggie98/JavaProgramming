package day47_Recap.phoneTask;

public final class iPhone extends Phone{//iPhone IS A Phone
//iPhone class cannot be inherited, will not have subclasses
    public iPhone(String model, String size, double price, String color){
        super("Apple", model, size, price, color);
    }


    public void call(long phoneNumber) {//Overriding
        System.out.println("Apple iphone is calling " + phoneNumber);
    }

    public void call(long phone1, long phone2){//Overloading
        call(phone1);
        call(phone2);
    }

    public void call(long phone1, long phone2, long phone3){
        call(phone1, phone2);
        call(phone3);
    }

    public void text(long phoneNumber){
        System.out.println("Apple iphone is texting to " + phoneNumber);
    }

    public void faceTime(long phoneNumber){
        System.out.println("Apple's iphone is face timing with " + phoneNumber);
    }

    public void faceTime(long phone1, long phone2){
        faceTime(phone1);
        faceTime(phone2);
    }

}
