package day43_OOP_Encapsulation.circleTask;

public class CircleObject {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setRadius(10);
        System.out.println(circle1.getDiameter());

        System.out.println(circle1);

        Circle circle2 = new Circle();
        circle2.setRadius(10);
        System.out.println(circle2.equal(circle1));
    }
}
