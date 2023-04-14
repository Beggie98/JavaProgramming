package day50_Exceptions_Recap;

public class Rectangle {
    private double length, width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0){
            throw new RuntimeException("No Such a Rectangle with a length of " + length);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0){
            throw new RuntimeException("No Such a Rectangle with a width of " + width);
        }
        this.width = width;
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public double area(){
        return length * width;
    }

    public double perimeter(){
        return 2 * (length + width);
    }

}
/*
Rectanngle task:
		private variables:
					length, width

		Encapsulate all the fields
				if the length or width of the rectangle is 0 or negative,
				throw an exception with a message of: "No Such a Rectangle with a length/width of: l/w "
				replace l/w with given length/width

		Add a constructor to initialize all the fields

		methods:
			area(): returns the area of the rectangle
			perimeter(): returns the perimeter of the rectangle
			toString()


 */