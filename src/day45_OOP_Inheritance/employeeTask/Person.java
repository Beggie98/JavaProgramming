package day45_OOP_Inheritance.employeeTask;

public class Person {
    public String name;
    public char gender;
    public int age;

    public Person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }


}
/*
EmployeeTask:
	Person:
		name, gender, age

		eat(), sleep(), drink()
 */