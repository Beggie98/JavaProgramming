package day52_Abstraction_Continue.shapeTask;

public class Cube extends Shape implements Volume {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0){
            throw new RuntimeException("Side cannot be negative or zero: " + side);
        }
        this.side = side;
    }

    public Cube(double side) {
        super("Cube");
        setSide(side);
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public double Volume() {
        return side * side * side;
    }
}
