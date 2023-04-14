package day42_Constructors_And_GarbageCollection;

public class ThisKeyWord {
    int a;
    public void method1(){
        System.out.println("Instance method");
    }

    public static void metod2(){
        System.out.println("Static method");
    }

    public ThisKeyWord(){
        System.out.println(this.a);
        this.method1();//can also call instance methods with this.
    }
    //this. : to call instance variables and methods
    //this() : used to call constructor
}
