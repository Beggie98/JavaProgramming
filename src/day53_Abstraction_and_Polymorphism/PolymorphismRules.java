package day53_Abstraction_and_Polymorphism;

import day45_OOP_Inheritance.animalTask.Animal;
import day45_OOP_Inheritance.animalTask.Cat;
import day45_OOP_Inheritance.animalTask.Dog;
import day45_OOP_Inheritance.employeeTask.Developer;
import day45_OOP_Inheritance.employeeTask.Employee;
import day45_OOP_Inheritance.employeeTask.Tester;
import day47_Recap.phoneTask.Phone;
import day47_Recap.phoneTask.Samsung;
import day47_Recap.phoneTask.iPhone;
import day53_Abstraction_and_Polymorphism.webDriverTask.ChromeDriver;
import day53_Abstraction_and_Polymorphism.webDriverTask.WebDriver;

public class PolymorphismRules {

    public static void main(String[] args) {
        //ONLY the referenceType's members can be called regardless of objectType
        //objectType decides which implementation to execute
        Phone phone1 = new iPhone("12","large",1000,"black");
        phone1.call(123456);
        phone1.text(123456);
        ((iPhone) phone1).faceTime(789456);//downcasting



        Phone phone2 = new Samsung("S16","Medium",9000,"White");


        System.out.println("-----------------------------------------------------------");

        WebDriver driver = new ChromeDriver();

        driver.get("www.amazon.com");

        System.out.println("---------------------------------------------------");

        Animal animal = new Dog("Lucy","Husky",'F',"Large",10,"White");//up casting
        animal.drink("Milk");
        animal.eat("Dog Food");
        animal.sleep();
        //animal.bark();//does not exist in Animal class
        //((Dog)animal).bark();//down casting for one time use
        ((Dog) animal).bark();

        Dog dog = (Dog) animal;//down casting and make it reusable
        dog.bark();

        System.out.println("----------------------------------------------------");

        Employee employee = new Tester("Ahmet",'M',27,11,"SDET",100000);

        employee.eat("Food");
        employee.drink("Water");
        employee.sleep();
        employee.attendMeeting();
        employee.work();
        ((Tester)employee).testing();
        //((  Developer)employee).fixBugs();//there is no IS A relationship between Tester and Developer: ClassCastException

        System.out.println("--------------------------------------------------------------");

        Animal animal2 = new Cat("Lucy","Husky",'F',"Large",10,"White");
        animal2.sleep();
        animal2.eat("Cat Food");
        animal2.drink("Milk");
        ((Cat) animal2).meow();
        ((Dog)animal2).bark();//there is no IS A relationship between Cat and Dog: ClassCastException


    }

}
