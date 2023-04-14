package day45_OOP_Inheritance.animalTask;

public class Animal {//superclass/parent class

    public String name;
    public String breed;
    public char gender;
    public String size;
    public int age;
    public String color;
    //since it is a parent class, the fields and methods are declared first and last time

    public static boolean breathe = true;

    public Animal(String name, String breed, char gender, String size, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
/*
Animal:
	name, breed, gender, size, age, color
	eat(), drink(), sleep(), toString()

 */