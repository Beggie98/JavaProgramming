package day45_OOP_Inheritance.animalTask;

public class Cat extends Animal{


    public Cat(String name, String breed, char gender, String size, int age, String color) {
        super(name, breed, gender, size, age, color);
    }

    public void meow(){
        System.out.println(name + " is meowing");
    }


}
/*
Attributes:
        name, breed, gender, size, age, color

        Action:
        meow(), eat(), drink(), sleep(), toString()


 */