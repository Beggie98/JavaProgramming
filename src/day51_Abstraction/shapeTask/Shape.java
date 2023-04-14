package day51_Abstraction.shapeTask;

public abstract class Shape {
    /*
    OOP Abstraction: hiding the implementation and details of the method
				     Concentrating on essentials/important things. not worrying about the details
    Abstract class: meant to be inherited/Parent (cannot be final)/CANNOT CREATE AN OBJECT (Not concrete)
    Abstract method: a method without implementation/body. Meant to be overriden
    final prevents abstract from being inherited or overriden
     */
    private final String name;
    public static boolean isShape;

    static {
        isShape = true;
    }

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();

    public abstract double perimeter();

    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area=" + area() +
                ". perimeter=" + perimeter() +
                '}';
    }
}
