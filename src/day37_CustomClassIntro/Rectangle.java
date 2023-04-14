package day37_CustomClassIntro;

public class Rectangle {
    public double width, length;
    //this keyword: for object instances ONLY
    //this. can call the instance of the objects ( instance variables & methods )

    public void setInfo(int width, int length){
        this.width = width;
        this.length = length;
    }

    public double calculateArea(){
        double area = width * length;
        return area;
    }

    public double calculatePerimeter(){
        return (width + length)*2;
    }



    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" +calculateArea()+
                ", perimeter=" + calculatePerimeter()+
                '}';
    }
}
