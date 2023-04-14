package day51_Abstraction.shapeTask;

public final class Circle extends Shape {

    private double radius;
    public final static double PI = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0){
            throw new RuntimeException("Radius cannot be negative or Zero: " + radius);
        }
        this.radius = radius;
    }

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }


    @Override
    public double area() {
        return radius * radius *PI;
    }

    @Override
    public double perimeter() {
        return 2 * radius * PI;
    }



}
