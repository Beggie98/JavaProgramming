package day40_CustomClass_Statics;

public class Test {
    public static void main(String[] args) {
        System.out.println(StaticBlocks.list);//[A, B, C]


        ExecutionOfStaticBlock.method1();//static is run one time only
        ExecutionOfStaticBlock.method1();
        ExecutionOfStaticBlock.method1();
        ExecutionOfStaticBlock.method1();
        /*
        Static Block
        Method 1
        Method 1
        Method 1
        Method 1
         */

    }
}
