package day42_Constructors_And_GarbageCollection;

public class ConstructorCalls {

    public static void method1(){
        System.out.println("Method 1");
    }

    public static void method2(){
        method1();//Method 1
        System.out.println("Method 2");

    }

    public static void method4(){
        method1();
        method2();
        System.out.println("Method 4");
    }

    public static void method3(){
        //ConstructorCalls();//constructor cannot be called by its name, this() has to be used to call constructor
        //this();//only constructor can call another constructor
    }


    public ConstructorCalls(){//constructor can call regular methods
        //this();//recursive constructor is not allowed, cannot call itself or contain itself
        //this(10);//compile error cause ConstructorCalls(int a) contains ConstructorCalls()
        method1();
        method2();
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){//constructor call MUST be at the first step, otherwise it will give a compile error
        this();//calling no arg constructor
        System.out.println("Constructor with int arg");
    }


    public ConstructorCalls(String str){
        this();
        //this(10);//one constructor cannot call more than one constructor
        System.out.println("Constructor with string arg");
    }


    public static void main(String[] args) {
        method2();

        System.out.println("----------------------------------");

        new ConstructorCalls();

        System.out.println("------------------------------------");

        new ConstructorCalls(10);


    }


}
