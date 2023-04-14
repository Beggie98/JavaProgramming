package day55_OOPRecap_CollectionIntro;

import day37_CustomClassIntro.Dog;
import day51_Abstraction.shapeTask.Circle;
import day51_Abstraction.shapeTask.Rectangle;
import day51_Abstraction.shapeTask.Shape;

public class Polymorphism {

    public static void main(String[] args) {

        Object obj = new Dog();//polymorphism, object is parent of all the classes
        ((Dog) obj).play();//Object class doesn't have play(), so we need to downcast it first

        System.out.println(obj instanceof Dog);//true

        System.out.println("------------------------------------------------------");

        Shape obj2 = new Circle(3);
        System.out.println(((Circle) obj2).getRadius());

        System.out.println(obj2.area());

        System.out.println(obj2 instanceof Rectangle);//false

        System.out.println(((Rectangle)obj2).getW());//Exception, no IS A relationship between Circle and Rectangle

    }


}
