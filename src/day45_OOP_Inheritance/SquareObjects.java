package day45_OOP_Inheritance;

public class SquareObjects {
    public static void main(String[] args) {
        Square square = new Square(10);

        System.out.println(square.getSide());

        square.setSide(20);

        System.out.println(square.getSide());

        Square square1 = new Square(square.getSide());

        System.out.println(square.equals(square1));
        System.out.println("------------------------------------------");

        Square s1 = new Square(5);
        Square s2 = s1;

        s2.setSide(10);

        System.out.println(s1.getSide() + " : " + s2.getSide());

        System.out.println("------------------------------------------------");

        Square l1 = new Square(3);
        l1 = new Square(4);

        System.out.println(l1.getSide());

    }
}
