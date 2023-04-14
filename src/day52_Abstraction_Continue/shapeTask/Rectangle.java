package day52_Abstraction_Continue.shapeTask;

public final class Rectangle extends Shape{

    private double length, width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0){
            throw new RuntimeException("Length cannot be zero or negative: " + length);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0){
            throw new RuntimeException("Width cannot be zero or negative: " + width);
        }
        this.width = width;
    }

    public Rectangle(double length, double width) {
        super("Rectangle");
        setLength(length);
        setWidth(width);
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (width + length);
    }

}
