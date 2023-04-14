package day45_OOP_Inheritance;

class A {
    public A(){
        System.out.println("A");
    }
}

class B extends A{

    public B(){
        //super();//A: super() is called implicitly (by default)
        System.out.println("B");
    }

}

public class ConstructorCallsInInheritance {

    public static void main(String[] args) {
        new B();//A B
    }
}
