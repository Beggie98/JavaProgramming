package day52_Abstraction_Continue.shapeTask;

public abstract class Shape {

    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();

    public abstract double perimeter();

}
/*
Shape:
	Interface Volume:
		volume();

	Abstract Shape
		area();
		perimeter();


	Circle extends Shape
			area(){ r*r*PI }
			perimeter(){ }

	Rectangle extends Shape
			area(){ l * w }
			perimeter(){ }

	Square extends Shape
			area(){ s *s  }
			perimeter(){ }

	Triangle extends Shape
			area(){  }
			perimeter(){  }

	Cube extends Shape implements Volume
			area(){  }
			perimeter(){  }
			volume(){ }

	Cylinder extends Shape implements Volume
			area(){  }
			perimeter(){  }
			volume(){ }

	Tarus extends Shape implements Volume
			area(){  }
			perimeter(){  }
			volume(){ }

	Sphere extends Shape implements Volume
			area(){  }
			perimeter(){  }
			volume(){ }
 */