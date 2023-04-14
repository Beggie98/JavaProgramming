package day42_Constructors_And_GarbageCollection;

public class Car {
    public String make, model;
    public int year;
    public double price;
    public String color;

    public Car(String make) {
        this.make = make;
    }

    public Car(String make, String model) {
        this(make);
        this.model = model;
        year = 2000;
        price = 20000;
        color = "White";
    }

    public Car(String make, String model, int year) {
        this(make, model);
        this.year = year;
        price = 30000;
        color = "Black";
    }

    public Car(String make, String model, int year, double price) {
        this(make, model, year);
        this.price = price;
    }

    public Car(String make, String model, int year, double price, String color) {
        this(make, model, year, price);
        this.color = color;
    }

    public Car(int year, double price, String color) {
        this("Unknown","Unknown",year,price,color);
        /*
        this.year = year;
        this.price = price;
        this.color = color;
         */
    }


    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
2. class name: Car
		 instance variables:
		 		make, model, year, price, color

 		1st constructor: initializes the make ONLY

 		2nd constructor: initializes make & model
 				(MUST use constructor call to set the make)

		3rd constructor: initializes make, model, year
				(MUST use constructor call to set the make, model)

		4th constructor: initializes make, mode, year, price
				(MUST use constructor call to set the make, model, year)

		5th Constructor: intializes all the instances
				(MUST use constructor call to set the make, mode, year, price, color)

		instance methods: toString
 */