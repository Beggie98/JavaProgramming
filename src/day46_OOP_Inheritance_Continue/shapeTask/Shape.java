package day46_OOP_Inheritance_Continue.shapeTask;
//import java.lang.Object;//imported implicitly, Object class is Parent class of all the classes, also called root of the class hierarchy
public class Shape {
    private final String name;

    public final static boolean isShape, hasArea, hasPerimeter;



    static {
        isShape = true;
        hasArea = true;
        hasPerimeter = true;
    }


    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double calcArea(){
        return 0;
    }; //abstract method is a method without implementation/body. This method is meant to be overriden

    public double calcPerimeter(){
        return 0;
    }


    @Override
    public String toString() {
        return ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
/*
shapeTask
		1. create a class called Shape
						vairables: name, isShape(boolean), hasArea(boolean), hasPerimeter(boolean)

						add a constructor that can set all the fields

						methods: calcArea(), calcPerimeter(),
								 toString(): returns the name, area and perimeter that are returned by calcArea(), calcPerimeter()
 */