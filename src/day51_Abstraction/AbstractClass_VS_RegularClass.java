package day51_Abstraction;

class A{
    int a;
    static int b;

    public A(int a){
        this.a = a;
    }

    static {
        b = 200;
    }

    public static void main(String[] args) {

    }

    public void metod1(){

    }

    //public abstract void metod1(){}//regular class cannot have abstract class


}

abstract class B {
    int a;
    static int b;

    public B(int a) {
        this.a = a;
    }

    static {
        b = 100;
    }

    public static void main(String[] args) {

    }

    public void metod1(){

    }

}

public class AbstractClass_VS_RegularClass {


    public static void main(String[] args) {

        A obj = new A(10);

        //B obj = new B(a:20);//abstract method cannot have objects


    }


}
