package day51_Abstraction.shapeTask;

public final class Rectangle extends Shape {

    private double l, w;

    public double getL() {
        return l;
    }

    public void setL(double l) {
        if (l <= 0){
            throw new RuntimeException("Length cannot be zero or negative: " + l);
        }
        this.l = l;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        if (l <= 0){
            throw new RuntimeException("Width cannot be zero or negative: " + w);
        }
        this.w = w;
    }

    public Rectangle(double l, double w) {
        super("Rectangle");
        setL(l);
        setW(w);
    }

    @Override
    public double area() {
        return l * w;
    }

    @Override
    public double perimeter() {
        return 2 * (l + w);
    }


}
