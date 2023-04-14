package day45_OOP_Inheritance.animalTask;

public class Dog extends Animal{
    public Dog(String name, String breed, char gender, String size, int age, String color) {
        super(name, breed, gender, size, age, color);
    }//subclass/child class

    //constructor cannot be inherited
    //name, breed, gender, size, age, color, eat(), drink(), sleep(), toString() are inherited from Animal to Dog



    public void bark(){
        System.out.println(name + " is barking");
    }

}
/*
Attributes:
name, breed, gender, size, age, color

Actions:
	bark(), eat(), drink(), sleep(), toString()
 */