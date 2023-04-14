package day39_CustomClass_Statics.circleTask;

import java.text.DecimalFormat;

public class Circle {
    public double radius;
    public double diameter;
    //public static double pi = 3.14;

    public double caculateArea(){
        return Math.PI * Math.pow(radius,2);
    }

    public double calculatePerimeter(){
        return diameter*Math.PI;
    }

    public void setInfo(double radius) {
        this.radius = radius;
        diameter = 2*radius;
    }

    public String toString() {

        DecimalFormat df = new DecimalFormat("0.00");

        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", Area=" + df.format(caculateArea()) +
                ", Perimeter=" + df.format(calculatePerimeter()) +
                '}';
    }
}
/*
CircleTask
		1. create a class named Circle that has the followings features
            Attributes:
                    radius, diameter

                methods:
                    caculateArea(): returs the area of the circle
                    calculatePerimeter(): returns the perimeter of the circle
                    setInfo(): initializes all the instance of the Circle
                    toString(): displays the radius, diameter, perimeter and area of the circle object

 */