package day41_CustomClass_Constructors;

public class ConstructorsIntro {
/*
    public ConstructorsIntro(){//constructorName must be same as the class name
        System.out.println("Default Constructor");
    }

    //we can overload constructor as well
*/
    public ConstructorsIntro(int a){
        System.out.println("Constructor with int arg");
    }

 //setInfo() needs to be called to get it executed while constructors gets executed once object is created

    public static void main(String[] args) {
        new ConstructorsIntro(10);//constructor is only executed when you create an object and it runs automotically once object is created
    }

}
