package day40_CustomClass_Statics;

public class ExecutionOfStaticBlock {

    public static void method1(){
        System.out.println("Method 1");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
    }

    static {//first to run
        System.out.println("Static Block");
    }
}
