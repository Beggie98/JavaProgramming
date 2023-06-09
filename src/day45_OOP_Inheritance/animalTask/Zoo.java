package day45_OOP_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog("Lucy","Husky",'F',"Small",2,"White");
        dog.bark();
        dog.eat("dog food");
        dog.drink("water");
        dog.sleep();

        System.out.println(dog);
        System.out.println(Dog.breathe);

        System.out.println("-------------------------------------------------");

        Cat cat = new Cat("Fate","Van",'F',"Medium",2,"Black");
        cat.meow();
        cat.eat("cat food");
        cat.drink("milk");
        cat.sleep();

        System.out.println(cat);

        System.out.println("---------------------------------------------------");

        Tiger tiger = new Tiger("Leo","Bengal",'M',"small",6,"White");
        //tiger.bark();
        //tiger.meow();
        tiger.roar();
        tiger.eat("chicken");
        tiger.drink("tea");
        tiger.sleep();
        System.out.println(tiger);




    }
}
