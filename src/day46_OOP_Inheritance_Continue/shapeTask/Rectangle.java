package day46_OOP_Inheritance_Continue.shapeTask;

public class Rectangle extends Shape{

    private double width, length;


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0){
            return;
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0){
            return;
        }
        this.length = length;

    }

    public Rectangle(double width, double length) {
        super("Rectangle");
        setWidth(width);
        setLength(length);
    }

    public double calcArea(){
        return width * length;
    }

    public double calcPerimeter(){
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length + super.toString() +
                '}';
    }
}
