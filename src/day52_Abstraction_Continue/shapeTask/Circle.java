package day52_Abstraction_Continue.shapeTask;

public final class Circle extends Shape {

    private double radius;
    public static double PI = 3.14;

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0){
            throw new RuntimeException("Radius cannot be zero or negative: " + radius);
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * PI;
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }
}
