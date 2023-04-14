package day53_Abstraction_and_Polymorphism.carTask;

public interface Chargeable {

    //only public final static variables are allowed in an interface
    boolean hasBattery = true;//public final static by default

    /*
    public static void main(String[] args) {
        System.out.println(hasBattery);
    }
     */

    void charging();

}
