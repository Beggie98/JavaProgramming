package day46_OOP_Inheritance_Continue.shapeTask;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side < 0){
            return;
        }
        this.side = side;
    }

    @Override
    public double calcArea() {
        return side * side;
    }

    @Override
    public double calcPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side + super.toString() +
                '}';
    }
}
