package day46_OOP_Inheritance_Continue.shapeTask;

public class ShapeObjects {
    public static void main(String[] args) {

        Circle circle = new Circle(3);
        System.out.println(circle.calcArea());
        System.out.println(circle.calcPerimeter());
        System.out.println(circle);

        System.out.println("--------------------------------------");

        Rectangle rectangle = new Rectangle(10,20);
        System.out.println(rectangle.calcArea());
        System.out.println(rectangle.calcPerimeter());
        System.out.println(rectangle);

        System.out.println("--------------------------------------------");

        Square square = new Square(5);
        System.out.println(square.calcArea());
        System.out.println(square.calcPerimeter());
        System.out.println(square);
    }
}
