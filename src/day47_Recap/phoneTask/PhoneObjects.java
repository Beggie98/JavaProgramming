package day47_Recap.phoneTask;

public class PhoneObjects {
    public static void main(String[] args) {

        iPhone iphone = new iPhone("12","large",1100,"black");
        iphone.call(911);
        iphone.call(123456,911,984567);
        iphone.text(123456789);
        iphone.faceTime(12345648,54512354);
        //
        // iphone.freeze();
        System.out.println(iphone);

        System.out.println("-------------------------------------------------");

        Samsung samsung = new Samsung("galaxy s6","extra large",1000,"White");
        samsung.call(123456789);
        samsung.text(987456);
        samsung.text(4945648,564215647);
        samsung.text(456214,554876,1235544);
        samsung.freeze();
        //samsung.faceTime();

        System.out.println(samsung);
        System.out.println("--------------------------------------------------------");

        Nokia nokia = new Nokia("Brock","small",50,"Gray");
        nokia.call(896523);
        nokia.text(8547126);
        nokia.selfDefense();
        nokia.breakTheFloor();
        System.out.println(nokia);
        //nokia.freeze();
        //nokia.faceTime(5165545);

        nokia.setPrice(75);
        nokia.setColor("Blue");
        System.out.println(nokia);
        System.out.println(nokia.getPrice());

    }
}
