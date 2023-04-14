package day51_Abstraction.shapeTask;



public class ShapeObjects {

    public static void main(String[] args) {

        //Shape shape = new Shape("Shape");//we cannot create objects from abstract classes. Parent classes are usually NOT meant to have objects

        Circle circle = new Circle(3);
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(6,4);

        System.out.println(circle);
        System.out.println(square);
        System.out.println(rectangle);


    }

}
