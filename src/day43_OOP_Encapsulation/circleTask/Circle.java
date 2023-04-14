package day43_OOP_Encapsulation.circleTask;

public class Circle {
    private double radius, diameter;
    final private double PI = Math.PI;

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setRadius(double radius) {

        if (radius < 0){
            System.err.println("Radius cannot be negative");
            return;
        }


        this.radius = radius;
        diameter = 2 * radius;
    }

    public void setDiameter(double diameter) {

        if (diameter < 0){
            System.err.println("Diameter cannot be negative");
            return;
        }


        this.diameter = diameter;
        radius = diameter/2;
    }

    public boolean equal(Circle circle){
        return radius == circle.radius;
    }

    public double calcArea(){
        return PI * Math.pow(radius,2);
    }

    public double calcPerimeter(){
        return diameter * PI;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
/*1. Create a class named Circle
			Private variables:
				radius, diameter, PI

			generate getter & setter for all private fileds
					Make sure that radius & diameter of circle can never be set to negative

			add a constructor that can set all the fields

			Extra methods:
				equal(): accepts a Circle Object and returns true if the given circle is equal to the current circle
				calcArea(): returns the area
				calcPerimeter(): returns the perimeter
				toString()

 */