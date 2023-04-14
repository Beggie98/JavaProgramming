package day41_CustomClass_Constructors;

public class StaticPractice {//Top level class: cannot be static

    static class Test{//inner classes can be static or non-static. Static class is mainly used to store static members of the outer class
        static int b;
    }

    class TestB{
        int c;
    }

    public static int a = 100;

    public static void method1(){

    }

    static {

    }

    public static void main(String[] args) {
        System.out.println(StaticPractice.Test.b);


    }

}
