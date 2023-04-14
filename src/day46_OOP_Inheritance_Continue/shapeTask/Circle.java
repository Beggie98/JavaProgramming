package day46_OOP_Inheritance_Continue.shapeTask;

public class Circle extends Shape {//Circle IS A Shape

    private double radius, diameter;
    private final static double PI;

    static {
        PI = Math.PI;
    }

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
        setDiameter(radius*2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0){
            return;
        }
        this.radius = radius;
        diameter = 2*radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        if (diameter < 0){
            return;
        }
        this.diameter = diameter;
        radius = diameter/2;
    }

    @Override
    public double calcArea() {
        return radius * radius * PI;
    }//new implementation

    @Override
    public double calcPerimeter() {
        return diameter * PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter + super.toString() +
                '}';
    }
}
