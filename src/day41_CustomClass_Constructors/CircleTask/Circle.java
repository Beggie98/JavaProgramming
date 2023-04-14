package day41_CustomClass_Constructors.CircleTask;

import java.text.DecimalFormat;

public class Circle {

    public double radius;
    public double diameter;

    public static double PI;

    public Circle(double radius){
        this.radius = radius;
        diameter = 2 * radius;
    }

    static {
        PI = Math.PI;
    }

    public double area(){
        return PI * Math.pow(radius,2);
    }

    public double perimeter(){
        return diameter * PI;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + df.format(area()) +
                ", perimeter=" + df.format(perimeter()) +
                '}';
    }
}
